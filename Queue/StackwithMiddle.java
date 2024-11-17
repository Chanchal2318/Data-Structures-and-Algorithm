import java.util.*;

public class StackwithMiddle {
    public static class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head = null;
    public static Node mid = null;
    public static int count = 0;

    public static void push(int x) {
        Node newNode = new Node(x);

        // If stack is empty
        if (head == null) {
            head = newNode;
            mid = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        count++;

        // Update mid pointer if the number of elements is odd
        if (count % 2 == 0) {
            mid = mid.prev;
        }
    }

    public static int pop() {
        if (head == null) {
            System.out.println("Empty stack");
            return -1;
        }

        int val = head.data;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        count--;

        // Update mid pointer if the number of elements is odd
        if (count % 2 != 0) {
            mid = mid.next;
        }

        return val;
    }

    public static int findMiddle() {
        if (mid == null) {
            System.out.println("Empty stack");
            return -1;
        }
        return mid.data;
    }

    public static void deleteMiddle() {
        if (mid == null) {
            System.out.println("Empty stack");
            return;
        }

        // If there's only one element
        if (count == 1) {
            head = null;
            mid = null;
        } else {
            Node prevNode = mid.prev;
            Node nextNode = mid.next;

            if (prevNode != null) {
                prevNode.next = nextNode;
            }
            if (nextNode != null) {
                nextNode.prev = prevNode;
            }

            // Update mid pointer
            if (count % 2 == 0) {
                mid = nextNode;
            } else {
                mid = prevNode;
            }
        }

        count--;
    }

    public static void main(String[] args) {
        // Test the stack with middle element operations
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

        System.out.println("Middle Element: " + findMiddle());  // Output: 4
        deleteMiddle();
        System.out.println("Middle Element after deletion: " + findMiddle());  // Output: 3

        System.out.println("Popped Element: " + pop());  // Output: 6
        System.out.println("Middle Element: " + findMiddle());  // Output: 3
    }
}
