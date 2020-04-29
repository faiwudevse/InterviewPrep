/*
time complexity: O(n)
space complexity: O(1)
thought process: use fast and slow, fast step two nodes, slow step one node, eventually they will meet if the listnode has a 
cycel
*/
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean ret = false;

        while (slow != null && fast.next != null) {
            if (fast.next.next != null ) fast = fast.next.next;
            else break;

            if (slow.next != null ) slow = slow.next;
            else break;

            if (fast == slow) return true;
        }
        
        return false;
    }
}