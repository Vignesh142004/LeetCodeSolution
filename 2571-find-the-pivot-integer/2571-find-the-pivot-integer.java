class Solution {
    public int pivotInteger(int n) {
        if(n==1)
        {
            return n;
        }
        int sum=0,ans=0,index=-1;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        for(int i=n;i>=0;i--)
        {
             ans=ans+i;
             if(sum==ans)
             {
                index=i;
                break;
             }
             sum=sum-i;
        }
        return index;
        
    }
}