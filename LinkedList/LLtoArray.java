package LinkedList;
public class LLtoArray {
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

    public void addArr(){
        int i = 0;
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        temp = head;   // Here , we reinitialize the temp with head bcoz temp becomes null because of the above while loop that runs until temp becomes null.
        int a[] = new int[size];
        while(temp != null){
            a[i] = temp.data;
            temp = temp.next;
            i++;
        }
        System.out.print("[");
        for( i = 0 ;i<a.length;i++){
            System.out.print(a[i]+", ");
        }
        System.out.print("]");
    }
    
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
            System.out.println(temp.data+"-->");  
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LLtoArray l1 = new LLtoArray();
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        l1.addArr();
    }
}
