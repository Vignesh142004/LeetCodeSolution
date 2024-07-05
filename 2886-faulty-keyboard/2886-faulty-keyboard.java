class Solution {
    public String finalString(String s) {
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='i')
            {
                s1=s1.reverse();
            }
            else
            {
                 s1.append(s.charAt(i));
            }
        }
        return s1.toString();
        
        
    }
}