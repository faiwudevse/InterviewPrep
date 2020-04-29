/*
time complexity: O(n)
space complexity: O(n)
thought process: iterater all the node in hastable set, until adding the same listnode
whereas that listnode is cycle node
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode ret = null;

        while (head != null) {
            if (set.contains(head)) {
                ret = head;
                break;
            }
            set.add(head);
            head = head.next;
        }

        return ret;
    }
}

/*
method two
*/