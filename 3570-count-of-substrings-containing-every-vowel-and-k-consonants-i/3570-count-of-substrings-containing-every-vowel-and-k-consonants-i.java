class Solution {
    static boolean func(String s,int k)
    {
        boolean a=false;
        boolean e=false;
        boolean i=false;
        boolean o=false;
        boolean u=false;
        int con=0;
        int len=s.length();
        for(int b=0;b<len;b++)
        {
            char ch= s.charAt(b);
            if(ch=='a')
            {
                a=true;
            }
            else if(ch=='e')
            {
                e=true;
            }
            else if(ch=='i')
            {
                i=true;
            }
            else if(ch=='o')
            {
                o=true;
            }
            else if(ch=='u')
            {
                u=true;
            }
            else
            {
                con++;
            }
            if(con>k)
            {
                return false;
            }
        }
        if(a && e && i&& o && u && (con==k))
        {
            return true;
        }
        return false;
    }
    public int countOfSubstrings(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(func(s.substring(i,j+1),k))
                {
                    
                    count++;
                }
            }
        }
        return count;
        
        
    }
}