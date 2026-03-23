class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int x=i+1;
            int y=nums.length-1;
            while(x<y){
                if(nums[i]+nums[x]+nums[y]==0){
                    result.add(Arrays.asList(nums[i],nums[x],nums[y]));
                    x++;
                    y--;
                }
                else if((nums[i]+nums[x]+nums[y])<0){
                    x++;
                }
                else if((nums[i]+nums[x]+nums[y])>0){
                    y--;
                }
                else{
                    return new ArrayList<>(result);
                }
            }
        }
        return new ArrayList<>(result);
    }
}