class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(baskets[j]>=fruits[i])
                {
                    flag=true;
                    baskets[j]=0;
                    break;
                }
            }
            if(!flag)
            {
                ans++;
            }
        }
        return ans;
        
    }
}