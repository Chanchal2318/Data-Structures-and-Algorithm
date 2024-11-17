// //Min Heap
// package Heap;
// import java.util.*;
// public class Classroom {
//     static class Heap{
//         ArrayList<Integer> arr = new ArrayList<>();
//         public void add(int data){
//             // add at last
//             arr.add(data);
//             int child = arr.size()-1; // x is child index
//             int parent = (child-1)/2;  // parent index
//             while(arr.get(child)<arr.get(parent)){ //O(logn)
//                 // swap
//                 int temp = arr.get(child);
//                 arr.set(child , arr.get(parent));
//                 arr.set(parent,temp);
//                 child = parent;
//                 parent = (child -1)/2;
//             }
//         }
//         public int peek(){
//             return arr.get(0); 
//         }
//         private void heapify(int idx){
//             int left = 2*idx+1;
//             int right = 2*idx+2;
//             int minIdx = idx;
//             if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
//                 minIdx = left;
//             }
//             if(right < arr.size() && arr.get(minIdx) > arr.get(right) ){
//                 minIdx = right;
//             }
//             if(minIdx != idx){
//                 // swap 
//                 int temp = arr.get(idx);
//                 arr.set(idx,arr.get(minIdx));
//                 arr.set(minIdx, temp);
//                 heapify(minIdx);
//             }
//         }
//         public int remove(){
//             int data = arr.get(0);
//             // step:-1 swap 1st and last node
//             int temp = arr.get(0);
//             arr.set(0,arr.get(arr.size()-1));
//             arr.set(arr.size()-1 , temp);
//             //step:-2 delete the last node
//             arr.remove(arr.size()-1);
//             //step:-3 heapify
//             heapify(0);
//             return data;
//         }
//         public boolean isEmpty(){
//             return arr.size( ) == 0;
//         }
//     }
//     public static void main(String[] args) {
//         Heap h = new Heap();
//         h.add(3);
//         h.add(4);
//         h.add(1);
//         h.add(5);
//         while(!h.isEmpty()){
//             System.out.println(h.peek());
//             h.remove(); 
//         }
//     }
// }



//Max Heap




package Heap;
import java.util.*;
public class Classroom {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            // add at last
            arr.add(data);
            int child = arr.size()-1; // x is child index
            int parent = (child-1)/2;  // parent index
            while(arr.get(child)>arr.get(parent)){ //O(logn +)
                // swap
                int temp = arr.get(child);
                arr.set(child , arr.get(parent));
                arr.set(parent,temp);
                child = parent;
                parent = (child -1)/2;
            }
        }
        public int peek(){
            return arr.get(0); 
        }
        private void heapify(int idx){
            int left = 2*idx+1;
            int right = 2*idx+2;
            int maxIdx = idx;
            if(left < arr.size() && arr.get(maxIdx) < arr.get(left)){
                maxIdx = left;
            }
            if(right < arr.size() && arr.get(maxIdx) < arr.get(right) ){
                maxIdx = right;
            }
            if(maxIdx != idx){
                // swap 
                int temp = arr.get(idx);
                arr.set(idx,arr.get(maxIdx));
                arr.set(maxIdx, temp);
                heapify(maxIdx);
            }
        }
        public int remove(){
            int data = arr.get(0);
            // step:-1 swap 1st and last node
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1 , temp);
            //step:-2 delete the last node
            arr.remove(arr.size()-1);
            //step:-3 heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size( ) == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove(); 
        }
    }
}
 