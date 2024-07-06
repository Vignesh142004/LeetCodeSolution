class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<m-1;j++)
            {
                int val=mat[i][j];
                if(mat[i+1][j+1]==val)
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
                

        
    }
}