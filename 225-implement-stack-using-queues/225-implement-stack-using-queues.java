class MyStack {
    Queue<Integer> s;
    public MyStack() {
        s=new LinkedList<>();
    }
    
    public void push(int x) {
      s.add(x);
        for(int i=1;i<s.size();i++)
        {
            s.add(s.poll());
        }
    }
    
    public int pop() {
        return  s.poll();
    }
    
    public int top() {
      return   s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
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