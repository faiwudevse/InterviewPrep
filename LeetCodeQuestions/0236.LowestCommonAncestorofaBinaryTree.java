class Solution {
    pulbic TreeNode lowestCommonAncestor(TreeNode rooot, TreeNode p , TreeNode q) {
        if (root == null || root == p || root == q) return root;
    
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
    
        return left != null && right != null ? root : (left != null ? left: right);
    }
}