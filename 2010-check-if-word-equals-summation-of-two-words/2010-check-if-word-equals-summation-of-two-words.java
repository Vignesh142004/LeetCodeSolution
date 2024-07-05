class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        char ch[]=new char[26];
        int a=0;
        for(char ci='a';ci<='z';ci++)
        {
            ch[a++]=ci;
        }
        String s1="";
        for(int i=0;i<f.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(f.charAt(i)==ch[j])
                {
                    s1=s1+j;
                }
            }
        }
        String s2="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(s.charAt(i)==ch[j])
                {
                    s2=s2+j;
                }
            }
        }
        String s3="";
        for(int i=0;i<t.length();i++)
        {
            for(int j=0;j<26;j++)
            {
                if(t.charAt(i)==ch[j])
                {
                    s3=s3+j;
                }
            }
        }
        int sum1=Integer.parseInt(s1);
        int sum2=Integer.parseInt(s2);
        int sum3=Integer.parseInt(s3);
        if((sum1+sum2)==sum3)
        {
            return true;
        }
        return false;
        

        
    }
}