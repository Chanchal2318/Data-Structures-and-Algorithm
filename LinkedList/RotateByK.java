package LinkedList;
import java.util.*;
public class RotateByK {
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
    public static Node rotate(Node head,int k){
        if(head == null || k == 0){
            return head;
        }
        int size = 1;
        Node newHead;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        System.out.println("The size is "+ size);
        // If k is larger than size , reduce k 
        k = k % size;
        if(k == 0){
            return head;
        }
        temp.next = head;
        for(int i = 0 ;i<size-k;i++){
            temp = temp.next;
        }
        newHead = temp.next;
        temp.next = null;
        return newHead;
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
        int k = 3;
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3); 
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        print(head);
        head = rotate(head, k); // update the head
        print(head);
    }
}
