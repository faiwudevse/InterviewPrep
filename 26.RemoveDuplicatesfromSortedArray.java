class Solution {
    /*
    time complexity : O(n)
    space complexity : O(1)
    */
    public int removeDuplicate(int[] nums) {
        // two pointers 
        if (nums.length == 0) return 0;
        // Given nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
        // 0 0 1 1 1 2 2 3 3 4
        // i j 
        // 0 1 1 1 1 2 2 3 3 4 
        //   i j 
        // 0 1 2 1 1 2 2 3 3 4
        //     i     j
        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            // check when i's and j's  values are differnt, update the value for index (i+1)
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }
}