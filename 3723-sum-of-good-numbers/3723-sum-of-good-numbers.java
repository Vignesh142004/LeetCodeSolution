class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
           if(i-k<0 && i+k<n && nums[i+k]<nums[i])
           {
              ans=ans+nums[i];
           }
           else if(i+k>=n && i-k>=0 && nums[i-k]<nums[i])
           {
              ans=ans+nums[i];
           }
           else if(i-k>=0 && i+k<n && nums[i-k]<nums[i] && nums[i+k]<nums[i])
           {
            ans=ans+nums[i];
           }
        }
        return ans;

        
    }
}