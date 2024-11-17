import java.util.*;
public class NumberHashing{
    public static void main(String[] args) {
        int a[]={1,2,1,3,2,1,4};
        int hash[]=new int[8];
        for(int i=0;i<7;i++){
            hash[a[i]]+=1;
        }
        int q;
        System.out.println("Enter the value that you want to check appearance");
        Scanner sc=new Scanner(System.in);
        q=sc.nextInt();
        while(q-- !=0){
            int number;
            number=sc.nextInt();
            System.out.println(hash[number]);
        }
    }
}
 