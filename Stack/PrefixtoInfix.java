package Stack;
import java.util.Stack;

public class PrefixtoInfix {

    // Function to check if the character is an operator
    public static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }

    // Function to convert Prefix to Infix
    public static String conversion(String str) {
        // Stack to store operands
        Stack<String> st = new Stack<>();

        // Loop to traverse the prefix expression from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            // If character is an operand, push it to the stack
            if (!isOperator(ch)) {
                st.push(ch + "");  // Convert char to String before pushing
            }
            // If character is an operator
            else {
                // Pop two elements from the stack
                String operand1 = st.pop();
                String operand2 = st.pop();

                // Form the string "(operand1 operator operand2)"
                String temp = "(" + operand1 + ch + operand2 + ")";

                // Push the resulting string back to the stack
                st.push(temp);
            }
        }

        // The last remaining element in the stack is the final Infix expression
        return st.pop();
    }

    public static void main(String[] args) {
        String str = "*+AB-CD";
        System.out.println("Prefix Expression: " + str);

        // Convert prefix to infix
        String Infix = conversion(str);
        System.out.println("Infix Expression: " + Infix);
    }
}
