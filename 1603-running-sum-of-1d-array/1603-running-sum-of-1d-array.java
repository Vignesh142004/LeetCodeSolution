class Solution {
    public int[] runningSum(int[] nums) {
        int n1=nums[0];
        int n2;
        for(int i=1;i<nums.length;i++)
        {
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
        
    }
}