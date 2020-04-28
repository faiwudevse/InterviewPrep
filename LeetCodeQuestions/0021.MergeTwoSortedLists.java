class Solution {
    /*
    time complexity: O(n)
    space complexity: O(1)
    */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // prevHead listnode is to return the merged list node 
        ListNode prevHead = new ListNode(-1);

        // prev list node is to iterate and add the new node
        ListNode prev = prevHead;

        // compare l1 and l2 and adding the new list node accroding the condition until one of them is null
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                prev.next = l2;
                l2 = l2.next;
            } else {
                prev.next = l1;
                l1 = l1.next;
            }
            prev = prev.next;
        }
        
        // add the rest of listnode from l2 or l1
        prev.next = l1 == null ? l2 : l1;

        return prevHead.next;
    }
}