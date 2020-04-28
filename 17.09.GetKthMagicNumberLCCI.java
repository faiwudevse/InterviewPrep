/*
time complexity: O(n)
space complexity: O(n)
thought process: Create 3 ponters for 3, 5, 7
Compare the minimum value between them, and increment the pointer that as the minmum value
link: https://leetcode-cn.com/problems/get-kth-magic-number-lcci/submissions/
*/
class Solution {
    public int getKthMagicNumber(int k) {
        int p3 = 0;
        int p5 = 0;
        int p7 = 0;

        int[] dp = new int[k];
        dp[0] = 1;

        for (int i = 1; i < k; i++) {
            dp[i] = Math.min(Math.min(dp[p3] * 3, dp[p5] * 5), dp[p7] * 7);
            if (dp[i] == dp[p3] * 3) p3++;
            if (dp[i] == dp[p5] * 5) p5++;
            if (dp[i] == dp[p7] * 7) p7++;
        }

        return dp[k-1];
    }
}