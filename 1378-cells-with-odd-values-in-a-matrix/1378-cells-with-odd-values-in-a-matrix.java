class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int ans[][]=new int[m][n];
        int r=indices.length;
        for(int a=0;a<r;a++)
        {
            int row=indices[a][0];
            int col=indices[a][1];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==row)
                    {
                        ans[i][j]+=1;
                    }
                    if(j==col)
                    {
                        ans[i][j]+=1;
                    }
                }
            }
        }
            int count=0;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(ans[i][j]%2==1)
                    {
                        count++;
                    }
                }
            }  
        return count;
  
    }
}