class Solution {
    public String compressedString(String word) {
        StringBuilder ans=new StringBuilder();
        int n=word.length();
        int i=0;
        while(i<n)
        {
            int consecutive=0;
            char current=word.charAt(i);
            while(i<n && consecutive<9 && word.charAt(i)==current)
            {
                consecutive++;
                i++;
            }
            ans.append(consecutive).append(current);
        }
        return ans.toString();
        
    }
}