class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int val=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0 && val%2==0)
            {
                val++;
                count++;
            }
            else if(nums[i]==1 && val%2==1)
            {
                val++;
                count++;
            }
        }
        return count;
        
    }
}