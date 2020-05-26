/*
time complexity: O(n^3)
space complexity: O(n)
thought process: 
sorted the array
take a number out and minus the target number,
check the current target number is greater than the max target sum or is less than the min target sum, if it is skip that number
else continue to the level next level. until only have two number left, then we check the remain target value is equal the two index's sum
*/
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int len = nums.length;

        for (int i = 0; i < len - 3; i++) {
            // skip duplicate 
            if(i > 0 && nums[i] == nums[i - 1]) 
                continue;
            int minThree = nums[i + 1] + nums[i + 2] + nums[i + 3];
            int maxThree = nums[len - 1] + nums[len - 2] + nums[len - 3];
            int targetThree = target - nums[i];
            if(targetThree < minThree || targetThree > maxThree)
                continue;
            
            for (int j = i + 1; j < len - 2; j++) {
                // skip duplicate
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int minTwo = nums[i + 1] + nums[i + 2];
                int maxTwo = nums[len - 1] + nums[len - 2];
                int targetTwo = target - nums[i] - nums[j];
                if (targetTwo < minTwo || targetTwo > maxTwo)
                    continue;
                int left = j + 1;
                int right = len - 1;

                while (left < right) {
                    if (targetTwo == nums[left] + nums[right]) {
                        //skip duplicate
                        while(left < right && nums[left] == nums[left + 1])
                            left++;
                        while(left < right && nums[right] == nums[right - 1])
                            right--;
                        
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (targetTwo > nums[left] + nums[right]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}