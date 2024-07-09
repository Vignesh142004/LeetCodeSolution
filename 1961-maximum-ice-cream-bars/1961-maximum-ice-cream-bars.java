class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        int count=0;
        int sum=0;
        Arrays.sort(costs);
        for(int i=0;i<n;i++)
        {
            sum=sum+costs[i];
            if(sum<=coins)
            {
                count++;
            }
            else if(sum>coins)
            {
                break;
            }
        }
        return count;
        
    }
}