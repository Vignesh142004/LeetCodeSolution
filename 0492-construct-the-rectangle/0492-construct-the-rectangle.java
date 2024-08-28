class Solution {
    public int[] constructRectangle(int area) {
        int l=(int)Math.sqrt(area);
        int w=l;
        int ans[]=new int[2];
        while(l*w!=area)
        {
            if((l*w)<area)
            {
                w++;
            }
            else
            {
                l--;
            }
        }
        ans[0]=w;
        ans[1]=l;
        return ans;
        
    }
}