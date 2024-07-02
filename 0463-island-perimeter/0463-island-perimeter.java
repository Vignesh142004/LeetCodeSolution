class Solution {
    public int islandPerimeter(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans=0;
        int up=0,down=0,left=0,right=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                if(i==0)
                {
                    up=1;
                }
                else
                {
                   up=(grid[i-1][j]==0)?1:0;
                }
                if(j==0)
                {
                    left=1;
                }
                else
                {
                    left=(grid[i][j-1]==0)?1:0;
                }
                if(i==r-1)
                {
                    down=1;
                }
                else
                {
                    down=(grid[i+1][j]==0)?1:0;
                }
                if(j==c-1)
                {
                    right=1;
                }
                else
                {
                    right=(grid[i][j+1]==0)?1:0;
                }
                ans+=up+down+left+right;
                }
            } 
            
        }
        return ans;
        
    }
}