package LinkedList;

public class Y_IntersectionBest {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.next = null;
            this.data = data;
        }
    }
    public static Node head;
    public static Node tail;
    // public void addFirst(int data){
    //     Node newNode = new Node(data);
    //     if(head == null){
    //         head = tail = newNode;
    //         return;
    //     }
    //     newNode.next = head;
    //     head = newNode;
    // }
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
    public static Node intersection(Node head1, Node head2){
        Node d1 = head1;
        Node d2 = head2;
        while(d1 != d2){
            d1 = d1 == null ? head2 : d1.next;
            d2 = d2 == null ? head1 : d2.next;
        }
        return d1;
    }
    // public static Node addTwoNumbers(Node head1, Node head2){
    //     Node dummy = new Node(-1);
    //     Node temp = dummy;
    //     int carry = 0;
    //     while(head1 != null || head2 != null || carry != 0){
    //         int sum = carry;
    //         if(head1 != null){
    //            sum = sum + head1.data;
    //            head1 = head1.next;
    //         }
    //         if(head2 != null){
    //             sum = sum + head2.data;
    //             head2 = head2.next;
    //         }
    //         sum = sum+ carry;
    //         carry = sum/10;
    //         Node newNode = new Node(sum%10);
    //         temp.next = newNode;
    //         temp = temp.next;
    //     }
    //     return dummy.next;
    // }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(6);
        head1.next.next.next.next = new Node(7);
        Node head2 = new Node(4);
        head2.next = new Node(5);
        head2.next = head1.next.next.next;
        print(head1);
        print(head2);
        Node intersectionNode = intersection(head1, head2);
        if (intersectionNode != null) {
            System.out.println("Intersection at node with data: " + intersectionNode.data);
        } else {
            System.out.println("No intersection found.");
        }
         
        // System.out.println("reverse sum of two reversed linked list");
        // System.out.println(addTwoNumbers(head1, head2));;
        
    }
}


