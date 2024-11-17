package LinkedList;

public class Insert_Last {
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
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return; 
            }
            tail.next = newNode;
            newNode.next = null;
        }
        public void print(){
            Node temp = head;
            if(head == null){
                System.out.println("Empty linked list");
                return;
            }
            while(temp!= null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
    }
    public static void main(String[] args) {
        Insert_Last l1 = new Insert_Last();
        l1.addLast(2);
        l1.addLast(7);
        l1.print();
        
    }
}
