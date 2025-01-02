class Solution {
    static int func(int n)
    {
        String s=Integer.toBinaryString(n);
        boolean flag=true;
        for(char ch:s.toCharArray())
        {
            if(ch=='0')
            {
                flag=false;
            }
        }
        if(flag)
        {
            return n;
        }
        return func(n+1);
    }
    public int smallestNumber(int n) {
        int ans=func(n);
        return ans;
        
    }
}