class Solution {
    public int maximumDifference(int[] nums) {
        int max=0;
        boolean found=false;
        for(int i=0;i<nums.length-1;i++){
            int diff=0;
            for(int j=i+1;j<nums.length;j++){
                 if(nums[j]>nums[i]){
                    diff=nums[j]-nums[i];
                    found=true;
                 }
                 max=Math.max(max,diff);
            }
        }
        if(found){
        return max;
        }
        return -1;
    }
}