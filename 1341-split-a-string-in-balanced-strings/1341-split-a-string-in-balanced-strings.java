class Solution {
    public int balancedStringSplit(String s) {
        int n=s.length();
        int rcount=0;
        int lcount=0;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='R')
            {
                rcount++;
            }
            else if(s.charAt(i)=='L')
            {
                lcount++;
            }
            if(rcount==lcount)
            {
                ans++;
            }

        }
        return ans;
        
    }
}