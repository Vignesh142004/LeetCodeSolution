class Solution {
    public int possibleStringCount(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(st.size()==0)
            {
                st.push(ch);
            }
            else if(st.peek()==ch)
            {
                count++;
            }
            else
            {
                st.push(ch);
            }
        }
        return count+1;
        
    }
}