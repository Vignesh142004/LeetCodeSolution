class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<k)
            {
                count++;
                continue;
            }
            else
            {
                ans[i]=nums[i];
            }
        }
        return count;
        
    }
}