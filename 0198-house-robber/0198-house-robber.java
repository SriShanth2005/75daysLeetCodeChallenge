class Solution {
    public static int helper(int i,int[] arr,int[] dp){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.max(arr[i]+helper(i+2,arr,dp),helper(i+1,arr,dp));
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return Math.max(helper(0,nums,dp),helper(1,nums,dp));
    }
}