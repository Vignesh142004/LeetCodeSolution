class Solution {
    public String restoreString(String s, int[] indices) {
        int n=s.length();
        int m=indices.length;
        char ch[]=s.toCharArray();
        char ans[]=new char[ch.length];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[indices[i]]=ch[i];
            }
        }
        String a="";
        for(char h:ans)
        {
            a=a+h;
        }
        return a;
        
        

        
    }
}