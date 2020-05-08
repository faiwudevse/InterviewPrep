/*
time complexity: O(n)
space complexity: O(n)
link: https://leetcode.com/problems/sliding-window-maximum/
thought process: 
*/
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        
        if (n == 0) return nums;
        
        int[] result = new int[n - k + 1];

        // store index
        LinkedList<Integer> dq = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // remove numbers out of range k
            if (!dq.isEmpty() && dq.peek() < i - k + 1) dq.poll();

            // remove smaller numbers in k range as they are usless
            while (!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]) dq.pollLast();

            dq.offer(i);

            if (i - k + 1 >= 0) result[i - k + 1] = nums[dq.peek()];
        }

        return result;
    }
}