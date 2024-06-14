class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            res=res+Math.max(ans-nums[i],0);
            ans=Math.max(ans,nums[i])+1;
        }
        return res;
        
    }
}