class Solution {
    public String truncateSentence(String s, int k) {
        String ans[]=s.split(" ");
        String st="";
        for(int i=0;i<k;i++)
        {
            st=st+ans[i]+" ";
            
        }
        String s1=st.trim();
        return s1;
        
        
        
        
        
    }
}