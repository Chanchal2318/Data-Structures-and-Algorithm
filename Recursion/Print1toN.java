package Recursion;
import java.util.*;
public class Print1toN {
    public static void number(int n){
        int i=0;
        if(i>=n){
            return;
        }
        number(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("enter the number from where you want to stop");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        number(n);
    }
}
