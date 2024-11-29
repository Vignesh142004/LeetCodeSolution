class Solution {
    static boolean func(String s,int i,int j)
    {
        int l=i;
        int r=j;
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else if(s.charAt(i)!=s.charAt(j))
            {
                if(func(s,i,j-1))
                {
                    j--;
                }
                else if(func(s,i+1,j))
                {
                    i++;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}