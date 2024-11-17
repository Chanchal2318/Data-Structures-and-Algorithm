import java.util.*;
public class PermutationSafe{
    public static int count(int n){
        int count = 0;
        Queue<String> q = new LinkedList<>();
        for(int i = 1;i<=9;i++){
            q.offer(String.valueOf(i));
        } 
        while (!q.isEmpty()) {
            String current = q.poll();
            int number = Integer.parseInt(current);

            // If the number is within the given range, count it
            if (number <= n) {
                count++;
                char lastDigit = current.charAt(current.length() - 1);

                // Generate new numbers by appending digits >= lastDigit
                for (char digit = lastDigit; digit <= '9'; digit++) {
                    q.offer(current + digit);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Optimal Approach:");
        System.out.println("Count for n = 15: " + count(15));
    }
}