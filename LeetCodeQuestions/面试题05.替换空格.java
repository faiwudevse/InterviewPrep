/*
time complexity: O(n)
space complexity: O(n)
link : https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
thought process: recreate the string as go through each character and check if 
it is space, if it is append the "%20"
*/
class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }
}