class Solution {
    public static int sub(int sum,int[] arr,int target,int[] dp){
        if(sum==target){
            return 1;
        }
        if(sum>target){
            return 0;
        }
        if(dp[sum]!=-1){
            return dp[sum];
        }
        int ways=0;
        for(int num:arr){
            ways+=sub(sum+num,arr,target,dp);
        }
        return dp[sum]=ways;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];
        Arrays.fill(dp,-1);
      return  sub(0,nums,target,dp);
    }
}