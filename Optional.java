import java.util.Scanner;
import java.util.Stack;

public class Optional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhập số : ");
        int number = sc.nextInt();
        while (number > 0) {
            int binary[] = new int[40];
            int index = 0;
            while (number > 0) {
                index++;
                stack.push(number % 2);
                number = number / 2;
            }
            for (int i = 0; i < index; i++) {
                binary[i] = stack.pop();
                System.out.print(binary[i]);

            }

        }
    }


}
