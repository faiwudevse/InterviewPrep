class Solution {
    /*
    time complexity: O(N)
    space complexity: O(1) or O(N) if it need to create a new array
    */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // the case that we need to concern about is when the digiti is 9 
        // that we need carry one to the next digit
        for (int index = n - 1; index >= 0; index--) {
            if (digits[index] == 9) {
                digits[index] = 0;
            } else {
                digits[index] += 1;
                return digits;
            }
        }
        // the case that all digits are 9's, that we need to create new an array 
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}