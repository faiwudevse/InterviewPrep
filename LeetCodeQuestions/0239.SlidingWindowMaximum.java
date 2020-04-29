import java.util.ArrayDeque;

class Solution {
    ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
    int[] nums;
    public void cleanDeque(int i, int k) {
        if (!deque.isEmpty() && deque.getFirst() == i - k) deque.removeFirst();

        while(!deque.isEmpty() && nums[i] > nums[deque.getLast()]) deque.removeLast();
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;

        // init deque and output
        this.nums = nums;
        int max_idx = 0;

        for (int i = 0; i < k; i++) {
            clean_deque(i, k);
            deque.addLast(i);
            if(nums[i] > nums[max_idx]) max_idx = i;
        }

        int[] output  = new int[n - k + 1];
        output[0] = nums[max_idx];

        for(int i = k; i < n; i++) {
            clean_deque(i, k);
            deque.addLast(i);

        }

        return output;
    }
}