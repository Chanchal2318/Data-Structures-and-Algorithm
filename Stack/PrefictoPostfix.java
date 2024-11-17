package Stack;
import java.util.*;
public class PrefictoPostfix {
    // Function to check if the character is the operand
    public static boolean isOperand(char ch){
        return Character.isLetterOrDigit(ch);
    }
    // Function to convert prefix to postfix
    public static String conversion(String str){
        // Stack to stores operand 
        Stack<String>st = new Stack<>();
        // String res to stores the final postfix expression
        for(int i = str.length()-1 ;i>=0 ;i--){
            char ch = str.charAt(i);
            // If the character is an operand
            if(isOperand(ch)){
                st.push(ch+"");
            }
            else{
                String operand1 = st.pop();
                String operand2 = st.pop();
                String temp =  operand1 + operand2 + ch;
                st.push(temp);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String str = "*-A/BC-/AKL";
        System.out.println("Prefix Expression "+str);
        String postfix = conversion(str);
        System.out.println("Postfix expression : "+postfix);
    }
}
