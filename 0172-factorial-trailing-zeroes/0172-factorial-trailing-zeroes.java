class Solution {
    public int trailingZeroes(int n) {
        /*int fact=1;
        if(n==0)
        {
            return 0;
        }
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        String s=Integer.toString(fact);
        int len=s.length();
        int count=0;
        for(int i=len-1;i>=0;i--)
        {
        if(s.charAt(i)!='0')
        {
            break;
        }
        else{
            count++;
            continue;
        }
        }
        return count;*/
        int ans=0;
        while(n>0)
        {
            n=n/5;
            ans=ans+n;
        }
        return ans;

        
    }
}