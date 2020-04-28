class Solution {
    /*
    time complexity: O(n)
    space complexity: O(1)
    thought process: very similar to fibonacci sequence, the result is coming from the first and second sum
    */
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int first = 1;
        int second = 2;
        int third = 0;
        for(int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}