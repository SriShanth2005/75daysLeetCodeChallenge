class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        Stack<Integer> st=new Stack<Integer>();
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
              st.push(suffix);
            suffix*=nums[i];
        }
        int prefix=1;
        for(int i=0;i<nums.length;i++){
            int right=st.pop();
            ans[i]=prefix*right;
            prefix*=nums[i];
        }
        return ans;
    }
}