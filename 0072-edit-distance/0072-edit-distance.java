class Solution {
    public static int solve(int i,int j,String s,String t,int[][] dp){
        if(i==s.length()){
           return t.length()-j;
        }
        if(j==t.length()){
           return s.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j]=solve(i+1,j+1,s,t,dp);
        }
        int insert=1+solve(i,j+1,s,t,dp);
        int delete=1+solve(i+1,j,s,t,dp);
        int replace=1+solve(i+1,j+1,s,t,dp);
        return dp[i][j]=Math.min(insert,Math.min(delete,replace));
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,word1,word2,dp);
    }
}