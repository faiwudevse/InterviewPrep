/*

*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 ||( i > 0 && nums[i] != nums[i-1])) {
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];

                while (left < right) {
                    if (nums[right] + nums[left] == sum) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                    } 
                    else if (nums[right] + nums[left] > sum) right--;
                    else left++;
                }
            }
        }

        return res; 
    }
}