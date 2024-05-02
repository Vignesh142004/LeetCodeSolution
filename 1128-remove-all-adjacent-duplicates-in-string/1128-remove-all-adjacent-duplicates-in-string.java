class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s1.size()==0)
            {
                s1.push(s.charAt(i));
            }
            else if(s.charAt(i)==s1.peek())
            {
                s1.pop();
            }
            else
            {
                s1.push(s.charAt(i));
            }
        } 
        while(s1.size()!=0)
        {
            s2.push(s1.peek());
            s1.pop();
        }
        String ans="";
        while(s2.size()!=0)
        {
            ans=ans+s2.peek();
            s2.pop();
        }
        return ans;
        
    }
}