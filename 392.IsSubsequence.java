/*
time complexity: O(t)
space complexity: O(1)
thought process: two pointer
pointer ti iterate through t, increment si when char of si in s equals to char of ti in t
compare si and the length s
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0; 

        while (si < s.length() && ti < t.length()) {
            if (s.charAt(si) == t.charAt(ti)) {
                si++;
            }
            ti++;
        }

        return (si == s.length());
    }
}