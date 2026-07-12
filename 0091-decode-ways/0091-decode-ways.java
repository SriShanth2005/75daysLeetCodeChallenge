class Solution {
    public static int sub(int i,String s,int[] dp){
        if(i>=s.length()){
            return 1;
        }
        if(s.charAt(i)=='0'){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int ways=0;
        ways=sub(i+1,s,dp);
        if(i+1<s.length()){
           int num = (s.charAt(i) - '0') * 10 + (s.charAt(i + 1) - '0');
           if(num>=10 && num<=26){
            ways+=sub(i+2,s,dp);
           }
        }
        return dp[i]=ways;
    }
    public int numDecodings(String s) {
        int[] dp=new int[s.length()+1];
        Arrays.fill(dp,-1);
      return sub(0,s,dp);
    }
}