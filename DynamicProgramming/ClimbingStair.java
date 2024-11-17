// package DynamicProgramming;
import java.util.*;
public class ClimbingStair {
    // public static int countWays(int n){ // Recursion
    //     if(n==0){
    //         return 1;
    //     }if(n<0){
    //         return 0;
    //     }
    //     return countWays(n-1)+countWays(n-2); 
    // }
    public static int countWays(int n,int ways[]){
            if(n==0){
                return 1;
            }if(n<0){
                return 0;
            }
            if(ways[n] != -1){
                return ways[n];
            }
            ways[n]=  countWays(n-1,ways)+countWays(n-2,ways)+countWays(n-3,ways); 
            return ways[n];
        }
        public static int countWaysTab(int n){
            int dp[] = new int[n+1];
            dp[0] = 1;
            // tabulation loop
            for(int i=1;i<=n;i++){
                if(i==1){
                    dp[i] = dp[i-1];
                }
                else{
                dp[i] = dp[i-1] + dp[i-2];
                }
            }
            return dp[n];
        }
    public static void main(String[] args) {
        int n=5; // n=3 -> 3 ways & n=4 -> 5 ways => 8 ways
        int ways[] = new int[n+1];
        Arrays.fill(ways,-1);
        System.out.println(countWays(n,ways));
        System.out.println(countWaysTab(n));
    }
}
