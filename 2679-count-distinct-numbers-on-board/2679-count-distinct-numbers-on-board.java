class Solution {
    public int distinctIntegers(int n) {
        int ans=0;
        if(n==1||n==2)
        {
            return 1;
        }
        for(int i=1;i<=n;i++)
        {
            if(n%i==1)
            {
                ans=Math.max(ans,i);
            }
        }
        return ans;
        
    }
}