class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i]==0)
            {
            for(int j=i;j<i+3;j++)
            {
                if(nums[j]==0)
                {
                    nums[j]=1;
                }
                else if(nums[j]==1)
                {
                    nums[j]=0;
                }
            }
            count++;
            }
        }
        if(nums[n-1]==0||nums[n-2]==0)
        return -1;
        return count;
        
    }
}