package String;
import java.util.*;
public class MaximumOccurence {
    public static void maximum(String str){
        int[] freq = new int[256]; // Assuming ASCII characters

        // Traverse the string and count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        // Find the character with the maximum frequency
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > maxCount) {
                maxCount = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        // Print the character with the maximum frequency and its count
        System.out.println("Maximum occurring character: " + maxChar + " with frequency: " + maxCount);

    }
    public static void main(String[] args) {
        String str = "takeuforward";
        maximum(str);
    }
}
