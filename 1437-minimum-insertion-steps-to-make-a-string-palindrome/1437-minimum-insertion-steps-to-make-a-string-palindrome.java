class Solution {
    public int minInsertions(String s) {
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            s1=s1+s.charAt(i);
        }
        int m=s.length();
        int n=s1.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                dp[i][j]=-1;
            }
        }
        int ans=lcs(s,s1,m,n,dp);
        int result=m-ans;
        return result;
    }
    
        int lcs(String s,String s1,int m,int n,int dp[][])
        {
            if(m==0||n==0)
            {
                return 0;
            }
            if(dp[m][n]!=-1)
            {
                return dp[m][n];
            }
            if(s.charAt(m-1)==s1.charAt(n-1))
            {
                dp[m][n]=1+lcs(s,s1,m-1,n-1,dp);
                return dp[m][n];
            }
            else
            {
                int ans1=lcs(s,s1,m-1,n,dp);
                int ans2=lcs(s,s1,m,n-1,dp);
                dp[m][n]= Math.max(ans1,ans2);
                return dp[m][n];
            }
        
    }
}