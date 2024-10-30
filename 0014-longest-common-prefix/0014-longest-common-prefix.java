class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        int i=0;
        String first=strs[0];
        String last=strs[n-1];
        while(i<first.length() && i<last.length())
        {
            if(first.charAt(i)==last.charAt(i))
            {
                i++;  
            }
            else
            {
            break;
            }
        }
        String ans= first.substring(0,i);
        return ans;
        
    }
}