package Stack;
import java.util.*;

public class ValidParantheses {
    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[{}()]";
        System.out.println(isValid(s)); // Output should be true
    }
}
