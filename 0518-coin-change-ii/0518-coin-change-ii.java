class Solution {
    public int change(int amount, int[] coins) {
        int sum=amount;
        int n=coins.length;
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
        int ans= subset(ar,n,sum,dp);
        return ans;
        
    }
    static int subset(int ar[],int n,int sum,int dp[][])
    {
        if(n==0)
        {
            return 0;
        }
        if(sum==0)
        {
            return 1;
        }
        
        if(dp[n][sum]!=-1)
        {
             return dp[n][sum];
        }
        if(ar[n-1]>sum)
        return subset(ar,n-1,sum,dp);
        else
        {
            int pick=subset(ar,n,sum-ar[n-1],dp);
            int notpick=subset(ar,n-1,sum,dp);
            dp[n][sum]= pick+notpick;
            return dp[n][sum];
        }

    }
}