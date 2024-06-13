class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count=0;
        int sum=0;
        int n=cost.length;
        for(int i=n-1;i>=0;i--)
        {
            count++;
            if(count%3==0)
            {
                continue;
            }
            else
            {
                sum=sum+cost[i];
            }
        }
        return sum;
        
    }
}