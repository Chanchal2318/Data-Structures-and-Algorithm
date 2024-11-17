package String;
import java.util.*;
public class RemoveChar {
    public static String removecharacter(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            // Check if the character is a letter (alphabet)
            if (Character.isLetter(str.charAt(i))) {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Chanchal Rajput@9580392";
        System.out.println(removecharacter(str));;
    }
}
