import java.util.*;
public class Classroom {
    private static final String[] Keys = null;

    public static void main(String[] args) {
        // Create
        HashMap<String,Integer> hm = new HashMap<>();
        // Insert -O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",200);
        System.out.println(hm);
        // Get -O(1)
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Indonesia"));
        // Containskey - O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));
        // Remove - O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        // Size
        System.out.println(hm.size());
        // Is Empty
        System.out.println(hm.isEmpty());
        // To clear all the data
        hm.clear();
        // To print all the elements
        System.out.println(hm);
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",200);
        hm.put("Indonesia",150);
        hm.put("Nepal",250);
        hm.put("Bhutan",300);
        // Iterate over the hashmap
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Keys ="+k+",value="+hm.get(k) );
        }
        // entrySet() :- Prints all keys and value+
        System.out.println(hm.entrySet());
    }
}
