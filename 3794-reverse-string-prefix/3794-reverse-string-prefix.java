class Solution {
    public String reversePrefix(String s, int k) {

        int len=s.length();
        String ans="";
        for(int i=0;i<len;i++)
        {
            if(i<k)
            {
                ans=s.charAt(i)+ans;
            }
            else
            {
                ans=ans+s.charAt(i);
            }
        }
        return ans;
        
        
    }
}