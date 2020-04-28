class Solution {
    /*
    method 1
    create addNums function to create the sum of each digits
    put that in the while until the result is less than 10
    time complexity: O(log n)
    space complexity: O(1)
    */
    public int addDigits(int num) {
        
        while (num >= 10) {
            num = addNums(num);
        }
        
        return num;
    }

    private int addNums(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;;
            num /= 10;
        }
        return sum;
    }

    /*
    method 2
    */

    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}