// package DynamicProgramming;
// import java.util.*;
// public class TargetSum {
//     public static int TS(int numbers[],int target,int n){
//         //base case
//         if(n<0){
//             return 0;
//         }
//         if(numbers[n-1] <= target){
//            //include
//            int ans1 = numbers[n-1]+TS(numbers,target-numbers[n-1],n-1);
//            //exclude
//            int ans2 = TS(numbers,target,n-1);
//         }
        
//     }
//     public static void main(String[] args) {
//         int numbers[] = {4,2,1,7,3};
//         int n = numbers.length;
//         int target = 10;

//     }
// }
