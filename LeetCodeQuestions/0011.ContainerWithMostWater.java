class Solution {
    /*
    time complexity: O(n)
    space complexity: O(1)
    thought process:
    compare the right's and left's height, get the min value betweeen the two and calucate the area
    Increment left when the right's height is greater the left one, vice versa 
    */
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            maxArea = Math.max(Math.min(height[left], height[right]) * (right - left), maxArea);
            if (height[right] > height[left]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}