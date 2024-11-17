package Stack;
import java.util.*;

public class DuplicateParanthesis {

    public static boolean findDuplicate(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets and other characters to stack
            if (ch != ')') {
                st.push(ch);
            } else {
                // If we encounter a closing bracket
                int count = 0;

                // Pop until we find an opening bracket '('
                while (!st.isEmpty() && st.peek() != '(') {
                    st.pop();
                    count++;
                }

                // Pop the opening bracket '('
                if (!st.isEmpty()) {
                    st.pop();
                }

                // If the count is 0, it means the parentheses were empty, so it's a duplicate
                if (count == 0) {
                    return true; // Duplicate parentheses found
                }
            }
        }

        // If no duplicates found, return false
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+((c+d)))";

        if (findDuplicate(str)) {
            System.out.println("Duplicate parentheses found.");
        } else {
            System.out.println("No duplicate parentheses found.");
        }
    }
}

