class Solution {
    static int lcs(String s1,String s2)
    {
        int l1=s1.length();
        int l2=s2.length();
        int dp[][]=new int[l1+1][l2+1];
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
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[l1][l2];
    }
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int val=lcs(word1,word2);
        return (n-val)+(m-val);
        
    }
}