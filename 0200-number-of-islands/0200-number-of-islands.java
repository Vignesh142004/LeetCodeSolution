class Solution {
    static void dfs(int i,int j,int visit[][],char grid[][])
    {
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0' || visit[i][j]==1)
        {
            return;
        }
        visit[i][j]=1;
        dfs(i-1,j,visit,grid);
        dfs(i+1,j,visit,grid);
        dfs(i,j-1,visit,grid);
        dfs(i,j+1,visit,grid);
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int visit[][]=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1'&& visit[i][j]==0)
                {
                    count++;
                    dfs(i,j,visit,grid);
                }
            }
        }
        return count;

        
    }
}