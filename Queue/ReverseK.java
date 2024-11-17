import java.util.*;

public class ReverseK {
    public static void reverse(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();

        // Move the first k elements into the stack
        for (int i = 0; i < k; i++) {
            int front = q.remove();
            st.push(front);
        }

        // Pop all elements from the stack and put them back into the queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Move the remaining elements (after the first k) to the back of the queue
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k;
        System.out.println("Enter the value of k ");
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();

        // Add some elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        // Reverse the first k elements
        reverse(q, k);

        // Print the updated queue
        System.out.println("Updated Queue: " + q);
    }
}
