package String;
import java.util.*;
public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "TUF is a good platform";
        for(int i = s.length()-1 ; i >= 0 ;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        for(int j = s.length()-1  ; j>= 0 ; j--){
                System.out.print(s.charAt(j));
                if(s.charAt(j) == ' '){
                    break;
                }
            }
        }
    }

