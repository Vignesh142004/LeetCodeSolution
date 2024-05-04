class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int ans=0;
        int a=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]<nums[j])
                {
                  a=nums[j]-nums[i];
                  ans=Math.max(ans,a);
                }
            }
        }
        if(ans==0)
        {
            return -1;
        }
        return ans;
        
    }
}