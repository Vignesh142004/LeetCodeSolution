class Solution {
    static int mindis(String s1,String s2)
    {
        int l1=s1.length();
        int l2=s2.length();
        int dp[][]=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
        {
            dp[i][0]=i;
        }
        for(int i=0;i<=l2;i++)
        {
            dp[0][i]=i;
        }
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                }
            }
        }
        return dp[l1][l2];
    }
    public int minDistance(String word1, String word2) {
        int ans=mindis(word1,word2);
        return ans;
        
    }
}