/*
time complexity: every operation is O(1)
space complesity: O(n)
thought process: use two stack, the minStack compare the current peek with the value that is going to be pushed into the stack
if the pushed is less than the currrent peek, push the lesser value into the minStack
*/
class MinStack {
    Stack <Integer> stack;
    Stack <Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        if (!stack.isEmpty()) {
            if (minStack.peek() > x) {
                minStack.push(x);
            } else minStack.push(minStack.peek());
            stack.push(x);
        } else{
            minStack.push(x);
            stack.push(x);
        }
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
/*
time complexity: every operation is O(1)
space complexity: O(n)
thought process: the idea is very similar to use two stacks, instead of stack we're using array.
*/
class MinStack {

    /** initialize your data structure here. */
    private int top;
    private int capacity;
    private int[] data;
    private int[] minData;

    public MinStack(){
        capacity = 2;
        top = -1;
        data = new int[capacity];
        minData = new int[capacity];
    }
    
    public void push(int x){
        if(top + 1 == capacity){
            resize();
        }
        if(top == -1){
            minData[top+1] = x;
        }else{
            minData[top+1] = (x <minData[top]) ? x : minData[top];
        }
        data[++top] = x;
    }
    public void pop(){
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        top--;
    }
    public int top(){
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        return data[top];
    }

    public int getMin(){
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        return minData[top];
    }

    private void resize(){
        int[] tempData = new int[capacity];
        int[] tempMinData = new int[capacity];

        for(int i = 0; i < data.length; i++){
            tempData[i] = data[i];
        }

        for(int i = 0; i < minData.length; i++){
            tempMinData[i] = minData[i];
        }

        capacity *= 2;

        data = new int[capacity];
        minData = new int[capacity];

        for(int i = 0; i < tempData.length; i++){
            data[i] = tempData[i];
        }
        for(int i = 0; i < tempMinData.length; i++){
            minData[i] = tempMinData[i];
        }
    }
}