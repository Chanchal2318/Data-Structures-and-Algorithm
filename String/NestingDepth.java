package String;
import java.util.*;
public class NestingDepth {
    public static void main(String[] args) {
        String str = "(1)+((2))+(((3)))";
        int curr = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Increase depth when encountering '('
            if (ch == '(') {
                curr++;
                if (curr > max) {
                    max = curr; // Update max depth if current is greater
                }
            }
            // Decrease depth when encountering ')'
            else if (ch == ')') {
                curr--;
            }
        }

    System.out.println(max);
}
}
