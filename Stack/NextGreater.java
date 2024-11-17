// Not suggested because of TC:- o(N*N)
package Stack;
import java.util.*;
public class NextGreater {
    public static void next_greater(int a[]){
        int max = 0;
        Stack <Integer> s = new Stack<>();
        for(int i =0 ;i<a.length;i++){
            for(int j = i+1 ;j<a.length;j++){
                if(a[i]<a[j]){
                   max = a[j];
                   break;
                }
                max = -1;
            }
            System.out.println(s.push(max));;
        }
    }
    public static void main(String[] args) {
        int a[] = {6,8,0,1,3};
        next_greater(a);
    }
}
