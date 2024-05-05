class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n=nums.length;
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                ans=Math.abs(i-start);
                min=Math.min(min,ans);   
            }
        }
        return min;
        
    }
}