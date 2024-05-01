class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                s1.push(s.charAt(i));
            }
            else
            {
                if(s1.size()!=0)
                {
                s1.pop();
                }
                else
                {
                    continue;
                }
            }
        }
         for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                s2.push(t.charAt(i));
            }
            else
            {
                if(s2.size()!=0)
                {
                s2.pop();
                }
                else
                {
                    continue;
                }
            }
        }
        String a="";
        while(s1.size()!=0)
        {
            a=a+s1.peek();
            s1.pop();
        }
        String b="";
        while(s2.size()!=0)
        {
            b=b+s2.peek();
            s2.pop();
        }
        return a.equals(b);
        
    }
}