package Stack;
import java.util.*;
public class PostfixtoInfix {
    public static boolean isOperator(char ch){
        return Character.isLetterOrDigit(ch);
    }
    public static String conversion(String str){
        Stack<String>st = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(isOperator(ch)){
                st.push(ch+"");
            }
            else{
                String operand1 = st.pop();
                String operand2 = st.pop();
                String temp = "(" + operand2 + ch + operand1 +")";
                st.push(temp);
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String postfix = "ABC/-AK/L-*";
        System.out.println("Postfix Expression: " + postfix);
        String infix = conversion(postfix);
        System.out.println("Infix Expression: " + infix);
    }
}
