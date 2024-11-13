class MyQueue {
    Stack<Integer> stack_in;
    Stack<Integer> stack_out;

    public MyQueue() {
        stack_in = new Stack<>();
        stack_out = new Stack<>();
    }
    
    public void push(int x) {
        stack_in.push(x);
    }
    
    public int pop() {
        dumpStackIn();
        return stack_out.pop();
    }
    
    // public int peek() {
    //     dumpStackIn();
    //     return stack_out.peek();
    // }
    public int peek() {
        int removed_element = this.pop();
        stack_out.push(removed_element);
        return removed_element;
    }
    
    public boolean empty() {
        return (stack_in.isEmpty() && stack_out.isEmpty());
    }

    private void dumpStackIn() {
        if (stack_out.isEmpty()) {
            while (!stack_in.isEmpty()) {
                stack_out.push(stack_in.pop());
            }
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