class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1="";
        String s2="";
        for(String a:word1)
        {
            s1=s1+a;
        }
        for(String b:word2)
        {
            s2=s2+b;
        }
        return s1.equals(s2);        
    }
}