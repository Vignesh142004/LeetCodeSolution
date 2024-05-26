class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fmin=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        if(nums.length<3)
        {
            return false;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=fmin)
            {
                fmin=nums[i];
            }
            else if(nums[i]<smin)
            {
                smin=nums[i];
            }
            else if(nums[i]>smin)
            {
                return true;
            }
        }
        return false;
        
    }
}