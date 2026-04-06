class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int i=0;
        int j=nums.length-1;
        int target=0;
        while(i<j){
            if(nums[i]>nums[j]){
                i++;
            }else {
                j--;
            }
            target=nums[i];
        }
        return target;
    }
}