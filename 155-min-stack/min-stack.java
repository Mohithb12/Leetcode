class MinStack {
    Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        List<Integer> array = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        while(!stack.isEmpty()){
            array.add(stack.pop());
            min = Math.min(min,array.get(array.size()-1));
        }

        for(int i=array.size()-1;i >=0;i--){
            stack.push(array.get(i));
        }
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