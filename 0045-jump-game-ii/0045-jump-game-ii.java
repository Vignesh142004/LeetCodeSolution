class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int ans=0;
        int curstart=0;
        int curend=0;
        for(int i=0;i<n-1;i++)
        {
            curend=Math.max(curend,i+nums[i]);
            if(i==curstart)
            {
                ans++;
                curstart=curend;
            }
        }
        return ans;
        
    }
}