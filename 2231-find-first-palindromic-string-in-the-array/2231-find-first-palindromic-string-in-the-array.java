class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int a=0;a<n;a++)
        {
            int i=0;
            int j=words[a].length()-1;
            boolean ans=true;
            while(i<j)
            {
                if(words[a].charAt(i)==words[a].charAt(j))
                {
                    i++;
                    j--;
                }
                else 
                {
                    ans=false;
                    break;
                }
            }
            if(ans)
            {
                return words[a];
            }
        }
        return "";

        
    }
}