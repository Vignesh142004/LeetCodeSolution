class Solution {
    static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
    public String trimTrailingVowels(String s) {

        int n=s.length();
        String ans="";
        boolean flag=false;
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(isVowel(ch) && !flag)
            {
                continue;
            }
            else
            {
                flag=true;
                ans=ch+ans;
                
            }
        }
        return ans;
        
    }
}