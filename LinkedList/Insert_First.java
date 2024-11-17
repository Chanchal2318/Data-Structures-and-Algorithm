package LinkedList;

public class Insert_First {
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
    public int removeFirst(){
        int size = 4;
        int val = 0;
        if(size == 0){
            System.out.println("Empty linked list");
            return 0;
        }
        else if(size == 1){
        val = head.data;
        head = tail = null;
        size = 0;
        return val;
        }
        val = head.data;
        head = head.next;
        size -- ;
        return val;
    }
    public int removeLast(){
        int size = 4;
        int val = 0 ;
        if(size == 0){
            System.out.println("Empty Linked List");
            return 0;
        }
        else if(size == 1){
            val = head.data;
            head = tail = null;
            size -- ;
            return val;
        }
        Node prev = head;
        while(prev!=null){
              prev = prev.next;
        }
        val = prev.next.data;
        tail = prev.next;
        return val;
    }
    public static void main(String[] args) {
        Insert_First l1 = new Insert_First();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.print();
        l1.removeFirst();
        System.out.println("After removel the linked list will become");
        l1.print();
        l1.removeLast();
    }
}
