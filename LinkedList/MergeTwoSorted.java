package LinkedList;
import java.util.*;
public class MergeTwoSorted {
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
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty LinkedList");
            return ; 
        }
        while(temp!= null){
            System.out.println(temp.data+" ");  
            temp = temp.next;
        }
    }
    public Node merge(Node head1 , Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while((head1 != null) &&(head2 != null) ){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp = temp.next;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }
    public static void main(String[] args) {
        MergeTwoSorted l1 = new MergeTwoSorted();
        MergeTwoSorted l2 = new MergeTwoSorted();
        l1.add(4);
        l1.add(3);
        l1.add(2);
        l1.add(1);
        l1.print();
        System.out.println("........");
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.print();
    }
}
