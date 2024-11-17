package Recursion;
import java.util.*;
public class Factorial {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1 ;
        }
        return (n*factorial(n-1));
       
    }
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
       System.out.println( factorial(n));
        
    }
}
