// package Recursion;
// import java.util.*;
// public class PrintsubsequencesWithKsum {
//     public static void printsubsequences(int[] a, int idx,ArrayList<Integer>path,int k){
//         int sum=0;
//         if(idx == a.length){
//             if(k == sum){
//                System.out.println(path);
//             }
//             return;
//         }
//         printsubsequences(a,idx+1,path,sum);
//         path.add(a[idx]);
//         sum+=a[idx];
//         printsubsequences(a, idx, path, sum);
//         path.remove(path.size()-1);
//         sum-=a[idx];
//     }
//     public static void main(String[] args) {
//         int[] a={1,2,1};
//         int k=2;
//         ArrayList<Integer>path = new ArrayList<>();
//         printsubsequences(a,0,path,k);
//     }
// }



// Java implementation to find all the
// sub-sequences whose sum is K
 
import java.util.*;
public class SubsequenceSumK {
 
    // Function to find the subsequences
    // with given sum
    public static void subSequenceSum(
        ArrayList<ArrayList<Integer>> ans, 
        int a[], ArrayList<Integer> temp, 
                        int k, int start)
    {
        // Here we have used ArrayList
        // of ArrayList in Java for 
        // implementation of Jagged Array
 
        // if k < 0 then the sum of
        // the current subsequence
        // in temp is greater than K
        if(start > a.length || k < 0)
            return ;
 
        // if(k==0) means that the sum 
        // of this subsequence
        // is equal to K
        if(k == 0)
        {
            ans.add(
             new ArrayList<Integer>(temp)
             );
            return ;
        }
        else {
            for (int i = start; 
                 i < a.length; i++) {
 
                // Adding a new 
                // element into temp
                temp.add(a[i]);
 
                // After selecting an
                // element from the
                // array we subtract K
                // by that value
                subSequenceSum(ans, a, 
                   temp, k - a[i],i+1);
 
                // Remove the lastly 
                // added element
                temp.remove(temp.size() - 1);
            }
        }
    }
 
    // Driver Code
    public static void main(String args[])
    {
        int arr[] = {5, 12, 3, 17, 1, 
                     18, 15, 3, 17};
        int k = 6;
        ArrayList<ArrayList<Integer>> ans;
        ans= new ArrayList<
                  ArrayList<Integer>>();
        subSequenceSum(ans, arr, 
            new ArrayList<Integer>(), k, 0);
             
        // Loop to print the subsequences
        for(int i = 0; i < ans.size(); 
         i++){
            for(int j = 0; 
              j < ans.get(i).size(); j++){
                System.out.print(
                    ans.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
