package LinkedList;

public class Y_Intersection {
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
    public static int getDifference(Node head1, Node head2){
        int len1 = 0 , len2 = 0 , sz1 = 0 , sz2 = 0;
        Node temp1 = head1;
        Node temp2 = head2;
        while(temp1 != null){
            temp1 = temp1.next;
            sz1++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            sz2++;
        }
        return sz1-sz2;
    }
    public static Node intersection(Node head1, Node head2){
        int diff = getDifference(head1, head2);
        if(diff < 0){
            while(diff++ != 0){
                head2 = head2.next;
            }
        }
        else{
            while(diff-- != 0){
                head1 = head1.next;
            }
        }
        while(head1 != null){
            if(head1 == head2){
                return head1;
            }
            head2 = head2.next;
            head1 = head1.next;
        }
        return head1;
    }
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
    }
}
