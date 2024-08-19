class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        for(int i=0;i<n;i++)
        {
            sum1=sum1+nums[i];
            if(sum==sum1)
            {
                return i;
            }
            sum=sum-nums[i];
        }
        return -1;
        
    }
}