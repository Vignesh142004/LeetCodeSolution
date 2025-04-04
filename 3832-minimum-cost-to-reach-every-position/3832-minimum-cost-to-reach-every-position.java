class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            int min=Integer.MAX_VALUE;
            for(int j=i;j>=0;j--)
            {
                min=Math.min(min,cost[j]);
            }
            ans[i]=min;
        }
        return ans;
        
    }
}