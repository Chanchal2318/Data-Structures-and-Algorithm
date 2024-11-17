package LinkedList;

public class Even_Odd {
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
            System.out.println("Empty LinkedList");
            return ; 
        }
        while(temp!= null){
            System.out.println(temp.data+"-->");  
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void segregate(){
        Node temp = head;
        Node temp1 = new Node(-1);
        Node temp2 = new Node(-1);
        while(temp != null){
            if(temp.data % 2 == 0){
                temp1.next = 
            }
        }

    }
    public static void main(String[] args) {
        
    }
}
