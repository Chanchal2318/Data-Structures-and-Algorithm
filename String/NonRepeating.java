package String;
import java.util.*;
public class NonRepeating {
    public static void nonrepeat(String str){
        int f[] = new int[200];
        char s[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
               continue;
            }
            else{
                f[(int)str.charAt(i)]++;
            }
        }
        for(int i =0 ;i<str.charAt(i);i++){
            if(f[(int) str.charAt(i)] == 1 && s[i] != ' '){
                System.out.print(s[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        String str = "Chanchal Rajput is a hardworking person";
        nonrepeat(str);
    }
}
