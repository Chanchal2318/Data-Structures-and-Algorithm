package LinkedList;

public class DetectCycle {
    public class Node{
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
            System.out.println(temp.data+"--> ");  
            temp = temp.next;
        }
    }
    public boolean detect_cycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DetectCycle l1 = new DetectCycle();
        l1.addFirst(6);
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        System.out.println(l1.detect_cycle(head));
    }
}
