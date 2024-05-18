class Solution {
     int func(int n,int dp[])
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 1;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        
        else
        {
            dp[n]= func(n-1,dp)+func(n-2,dp)+func(n-3,dp);
            return dp[n];
        }
        
    }
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int result= func(n,dp);
        return result;
        
    }
}