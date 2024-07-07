class Solution {
    public int numberOfAlternatingGroups(int[] nums) {
        int n=nums.length;
        int count=0;
        if(nums[0]!=nums[n-1] &&nums[0]!=nums[1])
        {
            count++;
        }
        if(nums[n-1]!=nums[n-2] &&nums[n-1]!=nums[0])
        {
            count++;
        }

        for(int i=1;i<n-1;i++)
        {
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1])
            {
                count++;
            }
        }
        return count;
        
    }
}