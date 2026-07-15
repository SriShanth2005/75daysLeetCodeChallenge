class Solution {
    public static int solve(int m,int n,int i,int j,int[][] arr,int[][] dp){
        if(i==m||j==n){
            return 0;
        }
        if(arr[i][j]==1){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solve(m,n,i,j+1,arr,dp);
        int down=solve(m,n,i+1,j,arr,dp);
         return dp[i][j]=right+down;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
       return solve(m,n,0,0,obstacleGrid,dp);
    }
}