class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        int target=0;

        map.put(0, 1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            target=sum-k;
            if(map.containsKey(target)){
                count+=map.get(target);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }
}