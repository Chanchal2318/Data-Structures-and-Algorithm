package DoublyLinkedList;

public  class DLL {
    public static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void print(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty Linked List");
        }
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void addLast(int data){
        int size = 0;
        Node temp = head;
        Node newNode = new Node(7);
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size == 0){
           head = tail = newNode;
           return;
        }
        if(size == 1){
            head.next = newNode;
            newNode = tail;
            return;
        }
        while(temp != null){
            temp = temp.next;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public int size(Node head){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public int removeFirst(){
        int val = 0;
        int sz = size(head);
        if(sz == 0){
            System.out.println("Empty Linked List");
            return 0;
        }
        if(sz == 1){
            head = tail = null;
            val = head.data;
            size = 0;
            return val;
        }
        val = head.data;
        head = head.next;
        head.prev = null;
        size -- ;
        return val;
    }
    public int removeLast(){
        int val = 0;
        int i = 0;
        int sz = size(head);
        Node temp = head;
        if(sz == 0){
            System.out.println("Empty Linked List");
            return 0;
        }
        if(sz == 1){
           val = head.data;
           head = tail = null;
           size = 0 ; 
           return val;
        }
        for(i=0;i<sz-1;i++){
            temp = temp.next;
        }
        val = temp.next.data;
        // temp.next = null;
        temp.next.prev = temp.prev;
        // temp.next = null;
        size --;
        return val;
    }
    public static void main(String[] args) {
        DLL l1 = new DLL();
        l1.addFirst(6);
        l1.addFirst(5);
        l1.addFirst(4);
        l1.addFirst(3);
        l1.addFirst(2);
        l1.addFirst(1);
        l1.print();
        System.out.println("After addition at the end the doubly linked list will become");
        l1.addLast(7);
        l1.print();
        System.out.println("After removal of first node");
        l1.removeFirst();
        l1.print();
        System.out.println("After the removal of last node from DLL");
        l1.removeLast();
        l1.print();
    }
}
