import java.util.*;
public class NonRepeatingStream {
    public static void find(String str){
        int count[] = new int[26];
        Arrays.fill(count ,-1);
        Queue<Character> q = new LinkedList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            q.add(ch);
            // Increase frequency in the HashMap
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        // Check for non-repeating character
        while(!q.isEmpty()){
            int frontFreq = map.get(q.peek());
            if(frontFreq == 1){
                System.out.println("First non-repeating character : "+ q.peek());
                break; // Break out of the while loop if found
            }
            else{
                // Remove character from queue if its frequency is more than 1
                q.poll();
            }
        }
        // If queue is empty, print -1
        if(q.isEmpty()){
            System.out.println("First non-repeating character : -1");
        }

    }
    public static void main(String[] args) {
        String str = "aabccd";
        find(str);
    }
}
