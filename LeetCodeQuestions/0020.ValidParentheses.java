class Solution {
    public boolean isValid(String s) {
        Map <Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==  '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if(!stack.empty()) {
                    char c = stack.peek();
                    if (hm.get(c) == s.charAt(i)) stack.pop();
                    else return false;
                } else {
                    return false;
                }
            }
        }
        
        return stack.empty();
    }
}