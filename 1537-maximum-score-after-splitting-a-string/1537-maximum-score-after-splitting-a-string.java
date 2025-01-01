class Solution {
    public int maxScore(String s) {
        int n=s.length();
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            int leftzero=0;
            int rightone=0;
            for(int j=i;j>=0;j--)
            {
                if(s.charAt(j)=='0')
                {
                    leftzero++;
                }
            }
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(j)=='1')
                {
                    rightone++;
                }
            }
            int val=leftzero+rightone;
            max=Math.max(val,max);
        }
        return max;
        
    }
}