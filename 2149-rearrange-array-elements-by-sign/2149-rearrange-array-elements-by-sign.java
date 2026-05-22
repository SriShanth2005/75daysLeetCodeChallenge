class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<Integer>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            l1.add(nums[i]);
        }else{
            l2.add(nums[i]);
        }
       }
       for(int j=0;j<nums.length/2;j++){
        nums[2*j]=l1.get(j);
        nums[2*j+1]=l2.get(j);
       }
       return nums;
    }
}