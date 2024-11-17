package Recursion;
public class REVERSEArray {
    public static void reverse(int a[],int n){
        if(n<0){
            return;
        }
        System.out.print(a[n-1]);
        reverse(a,n-1);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int n=a.length;
        reverse(a,n);
    }
}
