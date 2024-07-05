class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==-1)
                {
                    int max=Integer.MIN_VALUE;
                    for(int k=0;k<n;k++)
                    {
                        max=Math.max(matrix[k][j],max); 
                    }
                    matrix[i][j]=max;
                }
            }
        }
        return matrix;
        
    }
}