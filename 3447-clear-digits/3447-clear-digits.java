class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        Stack<Character> st1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
            if(st.size()!=0)
            {
                st.pop();
            }
            }
            else{
            st.push(s.charAt(i));
            }
        }
        while(st.size()!=0)
        {
            st1.push(st.peek());
            st.pop();
        }
        String ans="";
        while(st1.size()!=0)
        {
            ans=ans+st1.peek();
            st1.pop();
        }
        return ans;
        
    }
}