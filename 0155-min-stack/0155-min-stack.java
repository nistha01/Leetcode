class MinStack {
    Stack<Integer> stk;
    Stack<Integer> minStack;

    public MinStack() {
         stk= new Stack<Integer>();
        minStack=new Stack<Integer>();
        
        
    }
    int min =Integer.MAX_VALUE;
    
    public void push(int val) {
        
        stk.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
       int x = stk.pop();
        if(minStack.peek() == x) {
            minStack.pop();
        }
        
    }
    
    public int top() {
        int ans=0;
        if(stk.size()!=0){
            ans= stk.peek();
        }
        return ans;
        
    }
    
    public int getMin() {
    
       if(!minStack.isEmpty())
        min= minStack.peek();
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */