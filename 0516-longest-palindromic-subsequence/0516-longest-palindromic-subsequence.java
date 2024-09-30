class Solution {
    static int lps(String s1,String s2)
    {
        int l1=s1.length();
        int l2=s2.length();
        int dp[][]=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
        {
            for(int j=0;j<=l2;j++)
            {
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<=l1;i++)
        {
            dp[i][0]=0;
        }
        for(int i=0;i<=l2;i++)
        {
            dp[0][i]=0;
        }
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[l1][l2];
    }
    public int longestPalindromeSubseq(String s) {
        String rev="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            rev=s.charAt(i)+rev;
        }
        int ans=lps(s,rev);
        return ans;
    }
}