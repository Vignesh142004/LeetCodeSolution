class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int ans=0;
        int m=0;
        for(var r:rectangles)
        {
            int x=Math.min(r[0],r[1]);
            if(m<x)
            {
                m=x;
                ans=1;
            }
            else if(m==x)
            {
                ans++;
            }
        }
        return ans;
        
    }
}