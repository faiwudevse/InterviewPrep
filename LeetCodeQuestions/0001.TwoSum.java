import java.util.Map;

class Solution {
    /*
    time complexity: O(n)
    space complexity: O(n) at most for the hash table
    */
    public int[] twoSum(int[] nums, int target) {
        // create the hash table, store value and index as key and value
        Map<Integer, Integer> hm = new HashMap<> ();
        int[] res = new int[2];

        /*
        iterate all the elements in nums
        check the condition if targe - the item's value exist in the hashtable
        if it exist, return the index positions
        */
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                res[0] = hm.get(target - nums[i]);
                res[1] = i;
            }
            else {
                hm.put(nums[i], i);
            }
        }
        return res;
    }
}