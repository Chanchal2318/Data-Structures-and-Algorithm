import java.lang.*;
public class Count {
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int lcount = count(root.left);
        int rcount = count(root.right);
        int treecount = lcount + rcount + 1;
        return treecount;
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sum(root.left);
        int rightsum = sum(root.right);
        int treesum = leftsum+rightsum+root.data;
        return treesum;
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
    }
    
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int ldiam = diameter(root.left);
        int rdiam = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdiam = lh + rh + 1;
        return Math.max(selfdiam,Math.max(ldiam,rdiam));
    }
    static class Info{
        int diam;
        int ht;
        public Info( int diam,int ht){
               this.diam = diam;
               this.ht =  ht;
        }
    }
    public static Info diameter2(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);
        int diam = Math.max(leftInfo.diam, Math.max(rightInfo.diam , leftInfo.ht + rightInfo.ht +1));
        int ht = Math.max(leftInfo.ht, rightInfo.ht)+1;
        return new Info(diam,ht);
    }
    public static void main(String[] args){ 
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        System.out.println(count (root));
        System.out.println(sum(root));
        System.out.println(diameter(root));
        System.out.println("-----------");
        System.out.println(diameter2(root).diam);
    }
}
