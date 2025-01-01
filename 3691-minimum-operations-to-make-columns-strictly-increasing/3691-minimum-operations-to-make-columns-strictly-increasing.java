class Solution {
    public int minimumOperations(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if((grid[j][i])==(grid[j-1][i]+1) || grid[j][i]>grid[j-1][i])
                {
                    continue;
                }
                else
                {
                    int val=Math.abs(grid[j][i]-grid[j-1][i])+1;
                    grid[j][i]=grid[j][i]+val;
                    ans=ans+val;
                }
            }
        }
        return ans;   
    }
}