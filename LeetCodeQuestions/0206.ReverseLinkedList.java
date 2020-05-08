/*
time complexity: O(n)
space complexity: O(1)
thought process: reverse the linkedlist as it iterate though
link: https://leetcode.com/problems/reverse-linked-list/

          1 -> 2 -> 3 -> null
    ret    temp/head
  1.null -> 1 -> 2 -> 3 -> null
    ret    temp  head
  2.null -> 1 -> 2 -> 3 -> null
    ret    temp  head
  3.null <- 1    2 -> 3 -> null
            temp/ret  head
  4.null <- 1         2 -> 3 -> null
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ret = null ;

        while (head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = ret;
            ret = temp;
        }

        return ret;
    }
}