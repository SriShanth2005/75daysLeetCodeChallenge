class Solution {
    public String reverseWords(String s) {
        String[] arr=s.trim().split("\\s+");
        String t="";
        for(int i=arr.length-1;i>=0;i--){
            t+=arr[i];
            if(i!=0){
                t+=" ";
            }
        }
        return t;
    }
}