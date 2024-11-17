import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        HashMap <Integer , Integer> hm = new HashMap<>();
        int a[] = {1,1,1,1,2,2,2,3,3,4};
        for(int i = 0 ;i<a.length;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i],hm.get(a[i])+1);
            }
            else{
                hm.put(a[i],i);
            }
        }
        Set<Integer> KeySet = hm.keySet();
        for(Integer key : KeySet){
            if(hm.get(key)>a.length/3){
                System.out.println(key);
            }
        }
    }
}
