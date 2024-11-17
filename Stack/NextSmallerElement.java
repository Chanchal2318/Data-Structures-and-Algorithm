// Next smaller element for each index in the right side of an array
package Stack;
import java.util.*;
public class NextSmallerElement {
    public static int[] findSmaller(int a[]) {
        int n = a.length;
        int nw[] = new int[n];
        Stack<Integer> st = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements that are greater or equal to the current element
            while (!st.isEmpty() && st.peek() >= a[i]) {
                st.pop();
            }

            // If the stack is empty, no greater element found, else take the top of stack
            nw[i] = st.isEmpty() ? -1 : st.peek();

            // Push the current element to the stack
            st.push(a[i]);
        }

        return nw;
    }
    public static void main(String[] args) {
        int a[] = {3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9};
        System.out.println("Input Array: " + Arrays.toString(a));
        System.out.println("NextSmaller Elements: " + Arrays.toString(findSmaller(a)));
    }
}