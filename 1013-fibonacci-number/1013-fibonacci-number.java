class Solution {
    static int fibo(int n,int dp[])
    {
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }
    if(dp[n]!=-1)
    {
        return dp[n];
    }
    dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    return dp[n];
    }
    public int fib(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=fibo(n,dp);
        return ans;
        
    }
}