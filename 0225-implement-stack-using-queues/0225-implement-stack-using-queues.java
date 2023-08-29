class MyStack {
    Queue<Integer> q = new LinkedList<Integer>();
    
    public void push(int x) {
        q.add(x);
        int k = q.size();
        //rotation 
        for(int i = 0; i < k - 1; i++){
            Integer first = q.remove();
            q.add(first);
        }
    }
    
    public int pop() {
        return q.remove();      
    }
    
    public int top() {
        return q.peek();        
    }
    
    public boolean empty() {
        return q.isEmpty();
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