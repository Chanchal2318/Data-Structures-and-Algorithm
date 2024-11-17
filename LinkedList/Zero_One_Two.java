package LinkedList;
import java.util.*;
public class Zero_One_Two{
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
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void print(Node head){
        Node temp = head;
        if(head == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static  void sortList(Node head){
        int cnt0 = 0 , cnt1 = 0 , cnt2 = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == 0){
                cnt0 ++;
            }
            else if(temp.data == 1){
                cnt1++;
            }
            else{
                cnt2++;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(cnt0 > 0){
                temp.data = 0;
                cnt0--;
            }
            else if(cnt1 > 0){
                temp.data = 1;
                cnt1--;
            }
            else{
                temp.data = 2;
                cnt2--;
            }
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(0);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next= new Node(1);
        sortList(head);
        print(head);
    }
}