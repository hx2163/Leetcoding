class MyQueue {

    private static Stack <Integer> inStack;
    private static Stack <Integer> outStack;

    public MyQueue() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
        
    }
    
    public void push(int x) {
        inStack.push(x);
        
    }
    
    public int pop() {
        if(outStack.isEmpty()){
            in2out();
        }
        return outStack.pop();  
    }
    
    public int peek() {
        if(outStack.isEmpty()){
            in2out();
        }
        return outStack.peek();
    }
    
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public void in2out(){
        while(!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
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