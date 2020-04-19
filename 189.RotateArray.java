class Solution {
    /*
    time complexity : O(n)
    space complexity: O(1)
    */
    public void rotate(int[] nums, int k) {
        // every index will move k steps
        k %= nums.length;
        int i = 0;
        
        // 
        for (int start = 0; start < nums.length; start++) {
            int current = start;
            int prevValue = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prevValue;
                prevValue = temp;
                current = next;
                i++;
            } while (start != current);
        }
    }
}