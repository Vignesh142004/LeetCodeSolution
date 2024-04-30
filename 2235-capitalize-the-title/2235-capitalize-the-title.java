class Solution {
    public String capitalizeTitle(String title) {
        String a=title.toLowerCase();
        String s[]=a.split(" ");
        String ans="";
        for(String str:s)
        {
            if(str.length()>2){
            String s1=str.substring(0,1).toUpperCase();
            String s2=str.substring(1);
            ans=ans+s1+s2+" ";
            }
            else
            {
                 ans=ans+str+" ";
            }
           
            
        }
        return ans.trim();
        
    }
}