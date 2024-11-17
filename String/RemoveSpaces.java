package String;
import java.util.*;
public class RemoveSpaces {
    public static void remove_spaces(String str){
        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i) == ' '){
               str = str.substring(0, i) + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = "Chanchal Rajput is a hardworking person";
        remove_spaces(str);
    }
}
