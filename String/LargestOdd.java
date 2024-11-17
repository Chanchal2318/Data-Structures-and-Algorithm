package String;
import java.util.*;
public class LargestOdd {
    public static void main(String[] args) {
        String str = "2460";
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ;i<str.length();i++){
            int num = str.charAt(i) - '0';
            if(num>largest && num%2 != 0){
                largest = num;
            }
        }
        if(largest < 0){
            System.out.println("No odd mumber is present");
        }
        else{
            System.out.println(largest);
        }
    }
}
