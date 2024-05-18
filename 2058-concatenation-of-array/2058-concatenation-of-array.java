class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=2*n;
        int ar[]=new int[m];
        int j=0;
        for(int i=0;i<m;i++,j++)
        {
            ar[i]=nums[j];
            if(j==n-1)
            j=-1;
        }
        
        return ar;
        
    }
}