class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[n-1];
        int ans=max-min-2*k;
        return Math.max(0,ans);
        
    }
}