class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<accounts[i].length;j++)
            {
                 ans[i]=ans[i]+accounts[i][j];
            }
        }
        Arrays.sort(ans);
        return ans[n-1];
        
    }
}