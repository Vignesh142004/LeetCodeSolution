class Solution {
    static int next(int n,int t)
    {
        int temp=n;
        int pro=1;
        while(n>0)
        {
            int rem=n%10;
            pro=pro*rem;
            n=n/10;
        }
        if(pro==0 ||pro%t==0)
        {
            return temp;
        }
        return next(temp+1,t);
    }
    public int smallestNumber(int n, int t) {
        int ans=next(n,t);
        return ans;
        
    }
}