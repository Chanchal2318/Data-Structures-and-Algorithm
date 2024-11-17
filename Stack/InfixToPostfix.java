package Stack;
import java.util.*;
public class InfixToPostfix {
    // function to check the character is operand or not
    public static boolean isOperand(char ch){
        return Character.isLetterOrDigit(ch);
    }
    // Function to return the precedence of characters
    public static int precedence(char ch){
        switch(ch){
            case '+' : return 1 ; 
            case '-' : return 1;
            case '*' : return 2;
            case '/' : return 2;
            case '^' : return 3;
        }
        return -1;
    }
    // Function to convert infix to postfix
    public static String conversion(String expression){
        // Stack to store the operators
        Stack<Character> st = new Stack<>();
        // String 'result' to store final postfix expression
        StringBuilder result = new StringBuilder();
        // Traverse the expression character by character
        for(int i = 0 ;i<expression.length();i++){
            char ch = expression.charAt(i);
            // agar character operand hai , toh directly result mein add karo
            if(isOperand(ch)){
                result.append(ch);
            }
            // agar '(' hai , toh stack mein push karo
            else if(ch == '('){
               st.push(ch);
            }
            // agar ')' hai , toh stack sa pop kare jab tak '(' na mill jaye
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    result.append(st.pop());
                }
                // if '(' ko bhi pop kardo stack sa
                st.pop();
            }
            // agar operation mile ('+','-','*',"/".'^')
            else{
                while(!st.isEmpty() && precedence(st.peek()) >= precedence(ch)){
                    result.append(st.pop());
                }
                st.push(ch);
            }
        }
        // agar koi operators bachh jaye stack main toh postfix mein directly add kardo , top pop karke result mein add karo
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Infix expression : " + exp);
        String postfix = conversion(exp);
        System.out.println("Postfix expression : "+postfix);
    }
}
