class Solution {
    public static int min(int i,int[] arr,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        dp[i]=arr[i]+Math.min(min(i+1,arr,dp),min(i+2,arr,dp));
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
      return Math.min(min(0,cost,dp),min(1,cost,dp));
    }
}