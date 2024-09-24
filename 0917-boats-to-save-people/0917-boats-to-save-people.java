class Solution {
    public int numRescueBoats(int[] p, int limit) {
        Arrays.sort(p);
        int n=p.length;
        int i=0;
        int j=n-1;
        int boat=0;
        while(i<=j)
        {
            if(p[i]+p[j]<=limit)
            {
                boat++;
                i++;
                j--;
            }
            else if(p[j]<=limit)
            {
                boat++;
                j--;
            }
            
        }
        return boat;
        
    }
}