class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n=queries.length;
        int m=queries[0].length;
        int ans[]=new int[n];
        int plt[]=new int[s.length()];
        int lp[]=new int[s.length()];
        int rp[]=new int[s.length()];
        int pt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                pt++;
            }
            plt[i]=pt;
        }
        int left=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='|')
            {
                left=i;
            }
            lp[i]=left;
        }
        int right=-1;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='|')
            {
                right=i;
            }
            rp[i]=right;
        }
        for(int i=0;i<n;i++)
        {
            int st=queries[i][0];
            int end=queries[i][1];
            int p1=rp[st];
            int p2=lp[end];
            if(p1!=-1 && p2!=-1&& p1<p2)
            {
                ans[i]=plt[p2]-plt[p1];
            }
        }
        return ans;


        
    }
}