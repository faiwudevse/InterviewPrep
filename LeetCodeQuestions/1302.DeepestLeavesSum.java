/*
time complexity: O(n)
space complexity: O(n)
thought process: use bfs, go through each level and calculated the sum
*/
public Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int sum = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            sum = 0;
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null) 
                    q.offer(node.right);
                
            }
        }

        return sum;
    }
}

/*
time complexity: O(n)
space complexity: O(1)
thought process: use dfs, once root reach the deepest leaves, it will start adding the leaves' value to the sum
*/

public Solution {
    int depth = 0;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root, 0);
        return sum;
    }

    private void dfs(TreeNode root, int d) {
        if (root == null)
            return;

        if (d > depth) {
            depth = d;
            sum = root.val;
        } else if (d == depth) {
            sum += root.val;
        }

        d++;

        dfs(root.left, d);
        dfs(root.right, d);
    }
}
