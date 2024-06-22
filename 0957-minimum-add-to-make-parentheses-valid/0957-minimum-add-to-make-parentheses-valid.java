class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')')
            {
                if(st.size()!=0 &&st.peek()=='(')
                {
                    st.pop();
                }
                else 
                {
                    st.push(s.charAt(i));
                }
            }
        }
        return st.size();
        
    }
}