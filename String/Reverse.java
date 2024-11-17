package String;
import java.util.*;
public class Reverse {
    public static void reverse(String str){
        for(int i = str.length()-1 ;i>=0 ;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "Chanchal Rajput";
        reverse(str);
    }
}
