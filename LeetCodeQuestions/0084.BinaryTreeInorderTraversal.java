/*
time complexity: O(n)
space complexity: O(n)
thought process: use recurison method to traversal the tree inorder which is Left Right Root
*/

class Solution {
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
         reulst = new ArrayList<>();
        
        helper(root);

        return result;
    }

    private void helper(TreeNode node) {
        if (node != null) {
            helper(node.left);
            reulst.add(node.val);
            helper(node.right);
        }
    }
}