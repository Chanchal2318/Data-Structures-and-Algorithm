package LinkedList;

public class RemoveCycle {
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
    public void remove_cycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
               cycle = true;
               break;
            }
            if(cycle == false){
                break;
            }
        }
        Node prev =null;
        slow = head;
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }
    public static void main(String[] args) {
        RemoveCycle l1 = new RemoveCycle();
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        l1.print();
        l1.remove_cycle(head);
        l1.print();
        
    }
}
