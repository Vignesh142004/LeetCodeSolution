class Solution {
    public int[] decode(int[] encod) {
        int len=encod.length;
        int n=len+1;
        int ans[]=new int[n];
        int xor=0;
        for(int i=1;i<=n;i++)
        {
            xor=xor^i;
        }
        for(int i=0;i<len;i=i+2)
        {
            xor=xor^encod[i];
        }
        ans[n-1]=xor;
        for(int i=n-2;i>=0;i--)
        {
            ans[i]=ans[i+1]^encod[i];
        }
        return ans;
        
    }
}