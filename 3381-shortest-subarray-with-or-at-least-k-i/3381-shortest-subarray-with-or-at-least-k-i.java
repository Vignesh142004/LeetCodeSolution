class Solution {
    static int func(int nums[],int i,int j,int k)
    {
        int val=0;
        int count=0;
        for(int a=i;a<=j;a++)
        {
            count++;
            val=val|nums[a];
        }
        if(val>=k)
        {
            return count;
        } 
        return Integer.MAX_VALUE;
    }
    public int minimumSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int ans=func(nums,i,j,k);
                min=Math.min(ans,min);  
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
        
    }
}