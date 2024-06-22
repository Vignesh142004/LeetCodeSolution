class Solution {
    public int calPoints(String[] str) {
        int n=str.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++)
        {
            if(str[i].equals("C"))
            {
                if(st.size()!=0)
                {
                    st.pop();
                }
            }
            else if(str[i].equals("D") && st.size()!=0)
            {
                int two=2*(st.peek());
                st.push(two);
            }
            else if(str[i].equals("+"))
            {
                int top=st.pop();
                int add=top+st.peek();
                st.push(top);
                st.push(add);
            }
            else
            {
                st.push(Integer.parseInt(str[i]));
            }
        }
        int sum=0;
        while(st.size()!=0)
        {
            sum=sum+st.pop();
        }
        return sum;
        
    }
}