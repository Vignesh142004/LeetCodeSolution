class Solution {
    public int minCostToMoveChips(int[] position) {
        int n=position.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(position[i]%2==0)
            {
               count++; 
            }
        }
        int ans=n-count;
        if(ans<count)
        {
            return ans;
        }
        return count;
        
    }
}