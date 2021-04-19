import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Character> qeueu = new ArrayDeque<>();
        System.out.println("nhập chuỗi : ");
        String string = sc.nextLine();
        if (string.length()%2==0){
        for (int i=string.length()/2;i<string.length();i++){
            char a = string.charAt(i);
            qeueu.add(a);
        }}else {
            for (int i=string.length()/2+1;i<string.length();i++){
                char a = string.charAt(i);
                qeueu.add(a);
        }}
        int index = 0;
        for (int j=string.length()/2-1;j>=0;j--){
            char a = string.charAt(j);;
            if (qeueu.remove() == a){
               index++;
            }
       }
        System.out.println(index);
        if (index>=string.length()/2){
            System.out.println("là chuỗi Palindrome : ");
        }else {
            System.out.println("không phải là chuỗi Palindrome : ");
        }
    }


}
