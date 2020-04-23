import java.util.Arrays;
import java.util.Map;
/*
time complexity: O(n)
space complexity: O(min(n, m))
create a hash map to keep track number appear frequency
use index's value and appearance count as key and value for the hashmap
Increment the value in num1 as iterate in num1
Decrement the value in num2 as iterate in num2
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums2.length > nums1.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int n: nums1) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        int k = 0;

        for (int n: nums2) {
            int cnt = hm.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                hm.put(n, cnt - 1);
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
