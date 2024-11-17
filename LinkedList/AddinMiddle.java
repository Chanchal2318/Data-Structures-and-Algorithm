package LinkedList;

public class AddinMiddle {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data =  data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addMiddle(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node temp = head;
        int i =0;
        Node newNode = new Node(data);
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;       
    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("LinkedList is Empty");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public void Search(int data){
        Node temp = head;
        int i = 0;
        while(temp!=null){
            if(data == temp.data){
               System.out.println(i);
            }
            temp = temp.next;
            i++;
        }
    }
    public static void main(String[] args) {
        AddinMiddle l1 = new AddinMiddle();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addMiddle(5,2);
        l1.print();
        System.out.println("-------");
        l1.Search(2);
    }
}
