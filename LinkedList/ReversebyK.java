package LinkedList;
import java.util.*;
public class ReversebyK {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static void reverse(Node head,int k){
        Node temp = head;
        int val = 0 ;
        Stack<Integer> st = new Stack<>();
        while(temp.next != null){
            for(int i=0;i<k;i++){
                val = temp.data;
                st.push(val);
                temp = temp.next;
            }
            for(int i = 0 ;i<k;i++){
                System.out.print(st.peek()+"--->");
                st.pop();
            }
        }
        System.out.print(temp.data+"--->");
        System.out.print("null");
    }
    public static void main(String[] args) {
        int k = 3;
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        reverse(head,k);
    }
}
