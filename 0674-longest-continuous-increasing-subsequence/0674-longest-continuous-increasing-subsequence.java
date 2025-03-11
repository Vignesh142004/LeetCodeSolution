class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length;
        int count=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                count++;
                max=Math.max(max,count);
            }
            else
            {
                count=1;
            }
        }
        return Math.max(count,max);
        
    }
}