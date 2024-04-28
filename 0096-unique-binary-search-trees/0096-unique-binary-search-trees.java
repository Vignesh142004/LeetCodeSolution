class Solution {
    static int dp[]=new int[20];
    static int find(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        if(dp[n]>0)
        {
            return dp[n];
        }
           for(int i=1;i<=n;i++)
            {
            dp[n]+=find(i-1)*find(n-i);
            }
            return dp[n];
    }
    public int numTrees(int n) {
        int ans=find(n);
        return ans;
        
    }
}