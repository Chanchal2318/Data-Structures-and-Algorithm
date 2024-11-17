package LinkedList;

public class Palindrome {
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
            System.out.println(temp.data+" ");  
            temp = temp.next;
        }
    }
    // @SuppressWarnings("null")
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while((fast!=null) && (fast.next!=null)){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkPalindrome(){
        // Find mid
        Node mid = findMid(head);
        // Reverse the 2 half
        Node curr = mid;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // check if equal
        Node right = prev;
        Node left = head;
        while(right!=null){
            if(left.data!= right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Palindrome l1 = new Palindrome();
        l1.addFirst(1);
        l1.addFirst(3);
        l1.addFirst(2);
        // l1.addFirst(2);
        // l1.addFirst(2);
        l1.addFirst(2);
        l1.print();
        System.out.println( l1.checkPalindrome());
    }
}
