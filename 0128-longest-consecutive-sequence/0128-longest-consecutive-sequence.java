class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0)
        {
            return 0;
        }
        int max=1;
        int count=1;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i]!=nums[i-1])
            {
                if(nums[i]==nums[i-1]+1)
                {
                    count++;
                    max=Math.max(count,max);
                }
                else
                {
                    count=1;
                }
            }
        }
        return max;
        
    }
}