class Solution {
    public String replaceWords(List<String> dict, String s) {
        int n=dict.size();
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(str[i].startsWith(dict.get(j)))
                {
                    str[i]=dict.get(j);
                }
            }
            
        }
        String ans="";
        for(String s1:str)
        {
            ans=ans+s1+" ";
        }
        return ans.trim();
        
    }
}