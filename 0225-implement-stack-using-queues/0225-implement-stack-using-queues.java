class MyStack {
     Queue<Integer> q;
    public MyStack() {
      q=new LinkedList<>();  
    }
    
    public void push(int x) {
        q.add(x);
        for(int i=1;i<q.size();i++)
        {
            q.add(q.remove());
        }
        
    }
    
    public int pop() {
        int anspop=q.remove(); 
        return anspop;
    }
    
    public int top() {
        int anstop=q.peek(); 
        return anstop;  
    }
    
    public boolean empty() {
        boolean ansempty=q.isEmpty();
        return ansempty;   
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */