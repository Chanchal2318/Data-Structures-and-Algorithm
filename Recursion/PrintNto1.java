package Recursion;
import java.util.*;
public class PrintNto1 {
    public static void number(int n){
        int i=0;
        if(i>=n){
            return;
        }
        System.out.println(n);
        number(n-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("enter the number from where you want to stop");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        number(n);
    }
}
