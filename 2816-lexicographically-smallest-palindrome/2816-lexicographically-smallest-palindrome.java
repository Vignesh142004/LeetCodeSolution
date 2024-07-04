class Solution {
    public String makeSmallestPalindrome(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(ch[i]<ch[j])
            {
                ch[j]=ch[i];
            }
            else
            {
                ch[i]=ch[j];
            }
            i++;
            j--;
        }
        String ans="";
        for(char a:ch)
        {
            ans=ans+a;
        }
        return ans;
        
    }
}