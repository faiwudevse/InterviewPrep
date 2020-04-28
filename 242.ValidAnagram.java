class Solution {
    /*
    time complexity: O(n)
    space complexity: O(1)
    thought process: use count to keep track characters
                     Increment one for each characters as it iterate through s
                     Decrement one for each characters as it iterate through t
                     keep the count if every element is zero and it's anagram.
    */
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for(char c: t.toCharArray()) {
            count[c - 'a']--;
        }

        for(int i: count) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}