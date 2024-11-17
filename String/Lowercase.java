package String;
import java.util.*;
public class Lowercase {
    public static void main(String[] args) {
        String str = "Chanchal Rajput";
        Integer count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z') {  // Check if the character is lowercase
                count++;
            }
        }
        System.out.println("Number of lowercase letters: " + count);
    }
}
