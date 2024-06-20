class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans=new ArrayList<>();
        String sep="\\"+separator;
        for(String str:words)
        {
            String s[]=str.split(sep);
            for(int j=0;j<s.length;j++)
            {
                if(!s[j].equals(""))
                {
                ans.add(s[j]);
                }
            }
        }
        return ans;
        
    }
}