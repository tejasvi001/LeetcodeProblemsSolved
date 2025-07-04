class MyQueue {
    Stack<Integer> q;
    public MyQueue() {
        q=new Stack<Integer>();
    }
    
    public void push(int x) {
        q.push(x);
    }
    
    public int pop() {
        Stack<Integer> stack=new Stack<Integer>();
        while(!q.isEmpty()){
            stack.push(q.pop());
        }
        int x=stack.pop();
        while(!stack.isEmpty()){
            q.push(stack.pop());
        }
        return x;
    }
    
    public int peek() {
        Stack<Integer> stack=new Stack<Integer>();
        while(!q.isEmpty()){
            stack.push(q.pop());
        }
        int x=stack.peek();
        while(!stack.isEmpty()){
            q.push(stack.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */