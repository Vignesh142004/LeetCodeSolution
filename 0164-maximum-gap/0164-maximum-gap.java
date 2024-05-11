class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int ans=0;
        int sub=0;
        if(n<2)
        {
            return 0;
        }
        for(int i=0;i<n-1;i++)
        {
            int j=i;
               sub=Math.abs(nums[i]-nums[++j]);
               ans=Math.max(ans,sub);
        }
        return ans;
        
    }
}