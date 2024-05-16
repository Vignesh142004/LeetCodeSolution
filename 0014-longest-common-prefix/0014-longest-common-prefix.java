class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        int i=0;
        String one=strs[0];
        String two=strs[n-1];
        while(i<one.length() && i<two.length())
        {
            if(one.charAt(i)==two.charAt(i))
            {
                i++;
            }
            else{
            break;
            }
        }
        return one.substring(0,i);
        
    }
}