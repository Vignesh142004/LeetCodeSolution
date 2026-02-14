class Solution {
    public int maxDistinct(String s) {
        
        Set<Character> st=new HashSet<>();

        for(char ch:s.toCharArray())
        {
            st.add(ch);
        }

        return st.size();
    }
}