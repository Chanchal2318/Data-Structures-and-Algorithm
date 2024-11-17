package String;
import java.util.*;
public class Capitalize {
    public static void capitalize(String str){
        StringBuilder result = new StringBuilder();  // Use StringBuilder for efficient string manipulation
        String[] words = str.split(" ");  // Split the sentence into words

        for (String word : words) {
            if (word.length() == 1) { // If the word has only one letter
                result.append(word.toUpperCase()).append(" ");
            } else {
                // Use StringBuilder to construct each word with first and last letter capitalized
                StringBuilder sb = new StringBuilder(word);
                sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));  // Capitalize the first letter
                sb.setCharAt(word.length() - 1, Character.toUpperCase(sb.charAt(word.length() - 1)));  // Capitalize the last letter
 
                result.append(sb).append(" ");
            }
        }

        System.out.print(result.toString().trim());
    }
    public static void main(String[] args) {
        String str = "Chanchal Rajput wants to become a good enginner";
        capitalize(str);
    }
}
