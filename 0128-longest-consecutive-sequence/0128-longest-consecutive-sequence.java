class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int[] arr=new int[set.size()];
        int k=0;
        for(int i:set){
            arr[k++]=i;
        }
        if(set.size()==0){
            return 0;
        }
        int count=1;
        int max=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]+1){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}