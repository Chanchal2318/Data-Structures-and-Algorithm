package String;
import java.util.*;
public class RemoveBrackets {
    public static void remove(String str){
        StringBuilder ans = new StringBuilder();
        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i) != '(' &&  str.charAt(i) != ')'){
                ans.append(str.charAt(i));
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        String str =  "(((a+b)+(c+d)))";
        remove(str);
    }
}
