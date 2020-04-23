import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < num.length - 2; i++) {
            if (i == 0 ||( i > 0 && num[i] != nums[i-1])) {
                int left = i + 1;
                int right = num.length - 1;
                int sum = 0 - nums[i];

                while (left < right) {
                    if (num[right] + num[left] == 0) {
                        res.add(Arrays.asList(num[i], num[left], num[right]));
                        while (left < right && num[left] == num[left + 1]) left++;
                        while (left < right && num[rifht] == num[right - 1]) right--;
                    } 
                    else if (num[right] + num[left] > sum){
                        right--;
                    } 
                    else {
                        left++;
                    }
            
                }
            }
        }

        return res; 
    }
}