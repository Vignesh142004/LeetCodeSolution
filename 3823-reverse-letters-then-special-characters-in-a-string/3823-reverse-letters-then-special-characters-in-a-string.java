class Solution {
    public String reverseByType(String s) {

        String special="";
        String normal="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                normal=s.charAt(i)+normal;
            }
            else
            {
                special=s.charAt(i)+special;
            }
        }
        
        int a=0;
        int b=0;
        StringBuilder ans=new StringBuilder("");
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                  ans.append(normal.charAt(a++));
            }
            else
            {
                ans.append(special.charAt(b++));
            }
        }
        return ans.toString();
        
    }
}