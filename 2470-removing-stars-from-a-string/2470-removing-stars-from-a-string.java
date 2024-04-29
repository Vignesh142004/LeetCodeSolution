class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='*')
            {
                st.push(s.charAt(i));
            }
            else
            {
                st.pop();
            }
        }
        String ans="";
        while(st.size()!=0)
        {
            st1.push(st.peek());
            st.pop();
        }
         while(st1.size()!=0)
        {
            ans=ans+st1.peek();
            st1.pop();
        }
        return ans;
        
        
    }
}