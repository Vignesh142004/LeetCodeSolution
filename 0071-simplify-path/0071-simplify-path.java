class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        Stack<String> st1=new Stack<>();
        String str[]=path.split("/");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals(".."))
            {
                if(st.size()!=0)
                {
                    st.pop();
                }
            }
                else if(str[i].equals("")||str[i].equals("."))
                {
                    continue;
                }
                else
                {
                    st.push(str[i]);
                }
            }
            while(st.size()!=0)
            {
                st1.push(st.pop());
            }
        String ans="";
        while(st1.size()!=0)
        {
            ans=ans+"/";
            ans=ans+st1.pop();
        }
        if(ans.length()==0)
        {
            return "/";
        }
        return ans;


        
    }
}