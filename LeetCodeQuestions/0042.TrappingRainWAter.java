class Solution {
    public int trap(int[] height) {
        int ret = 0;
        int current = 0;
        
        Stack<Integer> stack = new Stack<>();
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.peek();
                stack.pop();
                if (stack.isEmpty()) break;
                int distance = current - stack.peek() - 1;
                int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
                ret += distance * boundedHeight;
            }
            stack.push(current++);
        }
        
        return ret;
    }
}