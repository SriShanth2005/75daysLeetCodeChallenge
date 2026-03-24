class Solution {
    public int maxArea(int[] height) {
        int left=0, right= height.length-1;
        int max= 0, ans=0;
        while(left<right){
            if(height[left]<height[right]){
                ans= height[left]*(right-left);
                left++;
            }
                
            else{
                ans= height[right]*(right-left);
                right--;
            }
            max= Math.max(ans, max);
        }
        return max;
    }
}