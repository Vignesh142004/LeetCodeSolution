class Solution {
    static boolean isResidue(String s)
    {
        Set<Character> st=new HashSet<>();
        int len=s.length();
        int lenOfPrefix=0;
        for(int i=0;i<len;i++)
        {
            lenOfPrefix++;
            st.add(s.charAt(i));
        }
        int distinctCharacter=st.size();
        if((lenOfPrefix%3)==distinctCharacter)
        {
            return true;
        }
        return false;
    }
    public int residuePrefixes(String s) {
        int len=s.length();
        int ans=0;
        String prefix="";
        for(int i=0;i<len;i++)
        {
            prefix=prefix+s.charAt(i);
            if(isResidue(prefix))
            {
                ans++;
            }
        }
        return ans;
        
    }
}