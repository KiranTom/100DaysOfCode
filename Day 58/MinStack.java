class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        
        stack.push(x);
        if (minStack.isEmpty() || x <= getMin()) {
            minStack.push(x);
        }
    }

    public void pop() {
        
        if (stack.isEmpty()) {
            return;
        }
        else {
            int x = stack.pop();
            if (x == minStack.peek()) {
                minStack.pop();
            }
        }
    }

    public int top() {
        
        return stack.peek();
    }

    public int getMin() {
        
        return minStack.peek();
    }
}