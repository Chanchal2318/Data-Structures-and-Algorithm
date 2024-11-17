package Recursion;
import java.util.*;
public class printname {
    public static void name(int n){
        int i=1;
        if(i>n){
            return;
        }
        System.out.println("Chanchal");
        name(n-1);
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the no.of times you want to print your name");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        name(n);
    } 
}
