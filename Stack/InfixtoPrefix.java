package Stack;
import java.util.*;
public class InfixtoPrefix {
    public static boolean isOperand(char ch){
        return Character.isLetterOrDigit(ch);
    }
    public static boolean isOperator(char ch){
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^');
    }
    public static int precedence(char ch){
        switch(ch){
            case '+' : return 1;
            case '-' : return 1;
            case '*' : return 2;
            case '/' : return 2;
            case '^' : return 3;
        }
        return -1;
    }
    public static String reverse(String str){
        StringBuilder res = new StringBuilder();
        for(int i = str.length()-1 ;i>=0 ;i--){
            char ch = str.charAt(i);
            if(ch == '('){
                res.append(')');
            }
            else if(ch == ')'){
                res.append('(');
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
    public static String conversion(String str){
        // Reverse the infix expression
        String reversedInfix = reverse(str);
        // Convert the infix to postfix expression
        String postfix = infixtoPostfix(reversedInfix);
        // Reverse the postfix to get the prefix expression
        return new StringBuilder(postfix).reverse().toString();
    }
    public static String infixtoPostfix(String str){
        Stack<Character>st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i =0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(isOperand(ch)){
                res.append(ch);
            }
            else if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop();
            }
            else if(isOperator(ch)){
                while(!st.isEmpty() && precedence(st.peek()) >= precedence(ch)){
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String infix = "((A-B)/C)*(D+E)";
        System.out.println("Infix Expression: " + infix);
        String prefix = conversion(infix);
        System.out.println("Prefix Expression: " + prefix);
    }
}
