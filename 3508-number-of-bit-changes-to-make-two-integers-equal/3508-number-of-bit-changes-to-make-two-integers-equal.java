class Solution {
    public int minChanges(int n, int k) {
        if((n&k)!=k)
        {
            return -1;
        }
        int nbit=0;
        int kbit=0;
        String s1=Integer.toBinaryString(n);
        String s2=Integer.toBinaryString(k);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1')
            {
                nbit++;
            }
        }
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='1')
            {
                kbit++;
            }
        }
        int ans=Math.abs(nbit-kbit);
        return ans;
        
    }
}