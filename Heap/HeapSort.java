// Ascending order sort
// package Heap;
// import java.util.*;
// public class HeapSort {
//     public static void heapify(int a[], int i, int size){
//         int left = 2*i+1;
//         int right = 2*i+2;
//         int maxIdx = i;
//         if(left < size && a[left] > a[maxIdx]){
//            maxIdx = left;
//         }
//         if(right < size && a[right] > a[maxIdx]){
//             maxIdx = right;
//         }
//         if(maxIdx != i){
//             // swap 
//             int temp = a[i];
//             a[i] = a[maxIdx];
//             a[maxIdx] = temp;
//             heapify(a,maxIdx,size);
//         }
//     }
//     public static void heapSort(int a[]){ 
//         // step 1:- build maxHeap
//         int n = a.length;
//         for(int i = n/2 ; i>= 0 ;i--){
//             heapify(a,i,n);
//         }
//         // step 2:- push largest at end
//         for(int i = n-1 ; i>0;i--){
//             // swap (first index with last index)
//             int temp = a[0];
//             a[0] = a[i];
//             a[i] = temp;

//             heapify(a,0,i); 
//         }
//     }
//     public static void main(String[] args) {
//         int a[] = {1,2,4,5,3};
//         heapSort(a);
//         // print
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i] + " ");
//         }
//         System.out.println();
//     }
// }



// Descending order sort

package Heap;
import java.util.*;
public class HeapSort {
    public static void heapify(int a[], int i, int size){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;
        if(left < size && a[left] < a[minIdx]){
           minIdx = left;
        }
        if(right < size && a[right] < a[minIdx]){
            minIdx = right;
        }
        if(minIdx != i){
            // swap 
            int temp = a[i];
            a[i] = a[minIdx];
            a[minIdx] = temp;
            heapify(a,minIdx,size);
        }
    }
    public static void heapSort(int a[]){ 
        // step 1:- build maxHeap
        int n = a.length;
        for(int i = n/2 ; i>= 0 ;i--){
            heapify(a,i,n);
        }
        // step 2:- push largest at end
        for(int i = n-1 ; i>0;i--){
            // swap (first index with last index)
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a,0,i); 
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5,3};
        heapSort(a);
        // print
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }
}
