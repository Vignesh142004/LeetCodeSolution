class Solution {
    public int garbageCollection(String[] ga, int[] t) {
        int len=0;
        for(String s:ga)
        {
            len=len+s.length();
        }
        for(int i=1;i<t.length;i++)
        {
            t[i]=t[i]+t[i-1];
        }
        int m=-1;
        int g=-1;
        int p=-1;
        for(int i=ga.length-1;i>=0;i--)
        {
            if(m==-1 && ga[i].contains("M"))
            {
               m=i-1;
            }
            if(g==-1 && ga[i].contains("G"))
            {
               g=i-1; 
            }
            if(p==-1 && ga[i].contains("P"))
            {
                p=i-1;
            }
        }
        if(m==-1)
        {
           m=0;
        }
        else
        {
            m=t[m];
        }
        if(g==-1)
        {
            g=0;
        }
        else
        {
            g=t[g];
        }
        if(p==-1)
        {
            p=0;
        }
        else
        {
            p=t[p];
        }
        return len+m+p+g;
        

        
    }
}