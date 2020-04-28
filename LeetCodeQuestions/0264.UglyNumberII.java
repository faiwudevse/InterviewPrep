/*
time complexity: O(n)
space complexity: O(n)
thought process: Create 3 ponters for prime number 2, 3, 5
Compare the minimum value between them, and increment the pointer that as the minmum value
link: https://leetcode.com/problems/ugly-number-ii/
*/
class Solution {
    public int nthUglyNumber(int n) {
        int p2 = 0;
        int p3 = 0;
        int p5 = 0;

        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = Math.min( Math.min(dp[p2] * 2, dp[p3] * 3), dp[p5] * 5);
            if(dp[i] == dp[p2] * 2) p2++;
            if(dp[i] == dp[p3] * 3) p3++;
            if(dp[i] == dp[p5] * 5) p5++;
        }
        
        return dp[n-1];
    }
}