import java.util.*;
public class SortUsingRecursuin{
    public static void sort(Stack<Integer> st){
        // Base case
        if(st.isEmpty()){
            return;
        }
        int topElement = st.pop();
        sort(st);
        insert(st, topElement);
    }
    public static void insert(Stack<Integer> st, int element) {
        // Base case: If stack is empty or top element is less than the element to be inserted
        if (st.isEmpty() || st.peek() <= element) {
            st.push(element);
            return;
        }
        int top = st.pop();
        insert(st, element);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(-5);
        st.push(18);
        st.push(14);
        st.push(-3);
        sort(st);
        System.out.println("Sorted Stack: " + st);
    }
}