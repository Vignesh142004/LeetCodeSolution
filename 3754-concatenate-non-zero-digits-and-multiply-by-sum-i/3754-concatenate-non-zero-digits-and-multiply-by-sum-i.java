class Solution {
    public long sumAndMultiply(int n) {

        String s="";
        long sum=0;
        
        while(n!=0)
        {
            int a=n%10;
            if(a!=0)
            {
                s=a+s;
                sum=sum+a;
            }
            n=n/10;
        }
        if(s=="")
        {
            return 0;
        }
        long x=Long.parseLong(s);

        return x*sum;

    
        
    }
}