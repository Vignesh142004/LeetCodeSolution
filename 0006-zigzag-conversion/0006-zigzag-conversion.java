class Solution {
    public String convert(String s, int r) {
        int n=s.length();
        if(r==1 ||n==1)
        {
            return s;
        }
        char ch[][]=new char[r][n/2+1];
        int col=0;
        int idx=0;
        int val=0;
        for(int j=0;j<(n/2+1);j++)
        {
            if(idx>=n)
            {
                break;
            }
            if(j==col){
            for(int i=0;i<r&&idx<n;i++)
            {
                 ch[i][j]=s.charAt(idx++);
                 
            }
                col=col+r-1;
                 val=r-2;
            }
            else
            {
                ch[val--][j]=s.charAt(idx++);
            }
            
        }
        String ans="";
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<(n/2)+1;j++)
            {
                if(ch[i][j]!='\u0000')
                {
                    ans=ans+ch[i][j];
                }
            }
        }
        return ans;
        
    }
}