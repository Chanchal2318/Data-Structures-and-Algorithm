package LinkedList;
import java.util.*;
public class AddOneLinkedlist {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }
   public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(5);
        head.next.next = new Node(6);
        print(head);
        head = reverse(head);
        Node temp = head;
        int carry = 1;
        while(temp != null){
            temp.data = temp.data + carry;
            if(temp.data < 10){
                carry = 0;
                break;
            }
            else{
                temp.data = 0;
                carry = 1;
            }
            temp = temp.next;
        }
        if(carry == 1){
            Node newNode = new Node(1);
            head = reverse(head);
            newNode.next = head;
        }
        print(head);
   }
}
