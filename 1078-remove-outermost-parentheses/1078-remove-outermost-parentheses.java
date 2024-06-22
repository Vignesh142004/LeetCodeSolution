class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        int count=0;
        String ans="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' && count==0)
            {
                count++;
            }
            else if(s.charAt(i)=='(')
            {
                ans=ans+s.charAt(i);
                count++;
            }
            else if(s.charAt(i)==')')
            {
                count--;
                if(count==0)
                {
                    continue;
                }
                else
                {
                ans=ans+')';
                }
            }
            
        }
        return ans;
        
        
    }
}