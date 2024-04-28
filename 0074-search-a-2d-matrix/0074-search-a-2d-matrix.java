class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        //int key=target;
        int first=0;
        int last=(n*m)-1;
        while(first<=last)
        {
            int mid=(first+last)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]>target)
            {
                last=mid-1;
            }
            else
            {
                first=mid+1;
            }
           
        }
         return false;
    }
}