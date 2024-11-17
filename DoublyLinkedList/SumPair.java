package DoublyLinkedList;
import java.util.*;
public class SumPair {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count ++; 
            temp = temp.next;
        }
        return count;
    }
    public static void sum(Node head, int target){
        Node temp = head.next;
        Node curr = head;
        int sz = size(head);
        int sum = 0;
        while(temp != null){
            for(int i = 0 ;i<sz ;i++){
                if(temp.data < target){
                    sum = curr.data + temp.data;
                    if(sum == target){
                        System.out.print(curr.data + "," + temp.data);
                    }
                }
                temp = temp.next;
            }
            temp = head;
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        
    }
}
