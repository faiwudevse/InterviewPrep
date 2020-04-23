class Solution {
    // iterate each character in the string
    // skip the first '(' and the last ')'
    public String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;

        for(char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) {
                s.append(c);
            }
            if (c == ')' && opened-- > 1) {
                s.append(c);
            }
        }
        return s.toString();
    } 
}