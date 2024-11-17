package Recursion;
public class Fibonacci {
    public static int recursion(int n){
        if(n<=1){
           return n;  
        }
        int f1=recursion(n-1);
        int f2=recursion(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(recursion(n));
    }
    
}
