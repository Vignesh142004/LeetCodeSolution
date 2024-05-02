class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int ans=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j]))
                {
                   ans=nums[i]^nums[j];
                   max=Math.max(ans,max);
                }
            }
        }
        return max;
        
    }
}