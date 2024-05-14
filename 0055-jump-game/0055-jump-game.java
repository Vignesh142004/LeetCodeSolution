class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=0;i<n && i<=j;i++)
        {
            j=Math.max(i+nums[i],j);
        }
        return i==n;

    }
}