class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return 0;
        }
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                continue;
            }
           return i;
        }
        return n-1;   
    }
}