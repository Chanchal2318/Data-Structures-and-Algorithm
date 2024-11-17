package Stack;
import java.util.*;
public class PostfixtoPrefix {
    // Function to check that the given character is an operand
    public static boolean isOperand(char ch){
        return Character.isLetterOrDigit(ch);
    }
    // Function to convert from postfix to prefix
    public static String conversion(String str){
        Stack<String> st = new Stack<>();
        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            if(isOperand(ch)){
                st.push(ch+"");
            }
            else{
                String operand1 = st.pop();
                String operand2 = st.pop();
                String temp =  ch + operand2 + operand1 ;
                st.push(temp);
            }
        }
        return st.pop();
    }
   public static void main(String[] args) {
    String postfix = "ABC/-AK/L-*";
    System.out.println("Postfix Expression: " + postfix);
    String prefix = conversion(postfix);
    System.out.println("Prefix Expression: " + prefix);
   } 
}
