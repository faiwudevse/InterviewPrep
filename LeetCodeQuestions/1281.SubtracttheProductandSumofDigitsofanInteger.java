class Solution {
    /*
    time complexity : O(logn)
    space complexity: O(1)
    thought process: calucate the product and sum from each digit 
    */
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }

        return product - sum;
    }   
}