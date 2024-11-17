public class FrogJumpTab {
    static int solve(int ind, int height[], int dp[]){
        dp[0]= 0;
        int n = height.length;
        for(ind=1;ind<n;ind++){
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = dp[ind-1]+Math.abs(height[ind]-height[ind-1]);
            if(ind > 1){
                jumpTwo = dp[ind-2]+Math.abs(height[ind]-height[ind-2]);
            }
            dp[ind] = Math.min(jumpTwo, jumpOne);
        }
        return dp[n-1];
    }
    public static void main(String[] args) {
        int height[] = {30,10,60,10,60,50};
        int n=6;
        int dp[] = {-1,-1,-1,-1,-1,-1,-1};
        // Arrays.fill(dp,-1);
        System.out.println(solve(5,height,dp));
    
    }
}
