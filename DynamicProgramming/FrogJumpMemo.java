public class FrogJumpMemo {
    static int solve(int ind, int[] height,int[]dp){
        if(ind==0){
            return 0;
        }
        if(dp[ind]!=-1){
            return dp[ind];
        }
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne = solve(ind-1,height,dp)+Math.abs(height[ind]-height[ind-1]);
        if(ind>1){
            jumpTwo = solve(ind-2,height,dp)+Math.abs(height[ind]-height[ind-2]);
        }
        return dp[ind]=Math.min(jumpOne,jumpTwo);
    }
    public static void main(String[] args) {
        int height[] = {30,10,60,10,60,50};
        int n=6;
        int dp[] = {-1,-1,-1,-1,-1,-1,-1};
        // Arrays.fill(dp,-1);
        System.out.println(solve(5,height,dp));
    }
}
