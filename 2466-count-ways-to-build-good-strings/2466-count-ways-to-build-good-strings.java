class Solution {
    public static int helper(int length,int low,int high,int zero,int one,int[] dp){
         int MOD = 1000000007;
        if(length>high){
            return 0;
        }
        if(dp[length]!=-1){
            return dp[length];
        }
        int ways=0;
        if(length>=low){
            ways=1;
        }
        ways += helper(length + zero, low, high, zero, one, dp);
        ways += helper(length + one, low, high, zero, one, dp);

          ways %= MOD;
         return dp[length]=ways;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp=new int[high+1];
        Arrays.fill(dp,-1);
        return helper(0,low,high,zero,one,dp);
    }
}