class Solution {
    public int coinChange(int[] coins, int amount) {
    int n= coins.length;
    int sum=amount;
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
        ar[i]=coins[i];
    }
    int dp[][]=new int[n+1][sum+1];
    for(int i=0;i<=n;i++)
    {
        for(int j=0;j<=sum;j++)
        {
            dp[i][j]=-1;
        }
    }
    int ans=coin(ar,n,sum,dp);
    
    if(ans>10000) 
    {
        return -1;
    } 
    return ans;   
    }
    int coin(int ar[],int n,int sum,int dp[][])
    {
        if(sum==0){
            return 0;
        }
        if(n==0)
        {
            return 100000;
        }
        if(dp[n][sum]!=-1)
        {
            return dp[n][sum];
        }
        int take=10000;
        if(ar[n-1]<=sum)
        {
            take=coin(ar,n,sum-ar[n-1],dp);
        }
        int nottake=coin(ar,n-1,sum,dp);
        dp[n][sum]= Math.min(take+1,nottake);
        return dp[n][sum];
    }
}