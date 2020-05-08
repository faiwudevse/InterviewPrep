/*
time complexity: O(n)
space complexity: O(n)
link: https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
thought process: use a stack to store every node as it iterate through
pop the pop top and assign the array of element

*/
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        int[] arr = new int[stack.size()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop().val;
        }

        return arr;
    }
}