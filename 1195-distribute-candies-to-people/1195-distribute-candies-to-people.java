class Solution {
    public int[] distributeCandies(int candies, int n) 
    {
        int ans[]=new int[n];
        int idx=0;
        int val=1;
        while(candies>0)
        {
             if(candies>=val)
             {
                ans[idx%n]=ans[idx%n]+val; 
                idx++;
                candies-=val;
                val++;
                
             }
             else
             {
                 ans[idx%n]=ans[idx%n]+candies;
                 break;
             }
        }
        return ans;
        
    }
}