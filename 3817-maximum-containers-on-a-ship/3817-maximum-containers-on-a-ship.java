class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int con[][]=new int[n][n];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(maxWeight<=0 || maxWeight<w)
                {
                    return ans;
                }
                else 
                {
                    ans++;
                    maxWeight=maxWeight-w;
                }
            }
        }
        return ans;
        
    }
}