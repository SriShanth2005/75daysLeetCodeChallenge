class Solution {
      public static int helper(int i,int end,int[] arr,int[] dp){
        if(i>end){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=Math.max(arr[i]+helper(i+2,end,arr,dp),helper(i+1,end,arr,dp));
      }
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums.length==1){
            return nums[0];
        }
        int[] dp1=new int[nums.length+1];
        Arrays.fill(dp1,-1);
        int case1=helper(0,n-2,nums,dp1);

        int[] dp2=new int[nums.length+1];
        Arrays.fill(dp2,-1);
        int case2=helper(1,n-1,nums,dp2);
        return Math.max(case1,case2);
    }
}