class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words)
        {
            boolean ans=true;
            for(int i=0,j=s.length()-1;i<j&&ans;i++,j--)
            {
                if(s.charAt(i)!=s.charAt(j))
                {
                    ans=false;
                }
            }
            if(ans)
            {
                return s;
            }
        }
        return "";
        
    }
}