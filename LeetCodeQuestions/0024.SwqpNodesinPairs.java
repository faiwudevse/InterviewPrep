/*
time complexity: O(n)
space complexity: O(1)
thought process: swap the near by two value, and jump to the next pair
*/
class Solution {
    public ListNode swaqPairs(ListNode head) {
        ListNode ret = head;

        while (head != null) {

            if (head.next != null) {
                int temp = head.val;
                head.val = headl.next.val;
                head.next.val = temp;
            } else break;

            if (head.next.next != null) {
                head = head.next.next;
            } else break;
        }

        return ret;
    }
}