class Solution {
    /*
    time complexity : O(n)
    space complexity; O(1)
    */
    public void moveZeros(int[] nums) {
        // two pointers
        int i = 0;

        // compare i's and j's value 
        // 0 1 0 3 12
        // i j
        // 1 0 0 3 12
        //   i j
        // 1 3 0 0 12
        //     i   j
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] == 0 && nums[j] != 0) {
                swaq(i, j, nums);
            }

            if (nums[i] != 0) {
                i++;
            }
        }
    }

    private void swaq(int indexA, int indexB, int[] arr) {
        int temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }
}