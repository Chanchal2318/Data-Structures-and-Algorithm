package Stack;
import java.util.*;
public class InfixtoPostfix1 {
    // Function to check that the ch is operand or not
    public static boolean isOperand(char ch){
        return Character.isLetterOrDigit(ch);
    }
    // Function to return the precedence of the operator
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
    // Function to convert the infix expression into postfix expression
    public static String conversion(String str){
        // Stack to store the operator
        Stack <Character> st = new Stack<>();
        // String 'res' to store the final postfix expression
        StringBuilder res = new StringBuilder();
        // function to traverse throughout the expression
        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i);
             // agar koi operand hai toh direct res main append kardo
            if(isOperand(ch)){
               res.append(ch);
            }
            // agar '(' yeah hai toh , stack mein push kardo
            else if(ch == '('){
                st.push(ch);
            }
            // agar ')' ,yeah hai toh stack sa pop krdo jab tak ')' yeah na mil jaye
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    res.append(st.pop());
                }
                st.pop(); // remove '(' kardo issa bhi
            }
            // agar operator mila toh ('+','-','/','*','^')
            else{
                while(!st.isEmpty() && precedence(st.peek()) >= precedence(ch)){
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        // agar koi operators bach gaye hai stack main toh ussa add kardo directly postfix main
        while(!st.isEmpty()){
            res.append(st.peek());
            st.pop();
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String str = "(a+b/c*(d+e)-f)";
        System.out.println("Infix expresion : "+ str);
        String postfix = conversion(str);
        System.out.println("Postfix expression : "+ postfix);
    }
}
