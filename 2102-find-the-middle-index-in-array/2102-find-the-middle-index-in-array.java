class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            sum1=sum1+nums[i];
        }
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum2=sum2+nums[i];
            if(sum1==sum2)
            {
                return i;
            }
            else
            {
                sum1=sum1-nums[i];
            }
        }
        return -1;
        
    }
}