class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        String s2=s1.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder rev=new StringBuilder(s2);
        StringBuilder ans=rev.reverse();
        String last=ans.toString();
        if(s2.equals(last))
        {
            return true;
        }
        return false;




        
    }
}