class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        int n=sandwiches.length;
        for(int stu:students)
        {
            q.add(stu);
        }
        for(int i=n-1;i>=0;i--)
        {
            st.push(sandwiches[i]);
        }
        int k=0;
        while(k<=n && st.size()!=0 && q.size()!=0)
        {
            if(q.peek()==st.peek())
            {
                q.remove();
                st.pop();
                k=0;
            }
            else if(q.peek()!=st.peek())
            {
                q.add(q.remove());
                k++;
            }
        }
        return st.size();


        
    }
}