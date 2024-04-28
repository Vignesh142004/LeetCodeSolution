class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n=nums.length;
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
             ans=ans+nums[i];
             if(ans==0)
             {
                count++;
             }
             continue;
        }
        return count;
        
    }
}