class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            String s1="";
            for(int j=i;j<n;j++)
            {
                int zero=0;
                int one=0;
                s1=s1+s.charAt(j);
                for(int a=0;a<s1.length();a++)
                {
                    if(s1.charAt(a)=='0')
                    {
                        zero++;
                    }
                    else
                    {
                        one++;
                    }
                }
                if(zero<=k || one<=k)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}