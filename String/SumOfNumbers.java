package String;
import java.util.*;
public class SumOfNumbers {
    public static int sum(String str){
        int sum = 0;
        for(int i =0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                sum = sum+str.charAt(i);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        String str = "xyz123";
        System.out.println( sum(str));;
    }
}
