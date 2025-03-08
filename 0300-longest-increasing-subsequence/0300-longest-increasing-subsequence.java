class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
           int m=0;
            for(int j=i-1;j>=0;j--)
            {
                 if(nums[i]>nums[j])
                 {
                    m=Math.max(m,dp[j]);
                 }
                 
            }
            dp[i]=m+1;
        }
        Arrays.sort(dp);
        return dp[n-1];
        
    }
}