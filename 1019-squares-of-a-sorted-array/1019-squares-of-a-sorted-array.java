class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            double sq=Math.pow(nums[i],2);
            ans[i]=(int)sq;
        }
        Arrays.sort(ans);
        return ans;
        
    }
}