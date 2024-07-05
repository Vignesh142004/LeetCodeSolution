class Solution {
    public int minimumPushes(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(i<8)
            {
                ans=ans+1;
            }
            else if(i<16)
            {
                ans=ans+2;
            }
            else if(i<24)
            {
                ans=ans+3;
            }
            else
            {
                ans=ans+4;
            }
        }
        return ans;

        
    }
}