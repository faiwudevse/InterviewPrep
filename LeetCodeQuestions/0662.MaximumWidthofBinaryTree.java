/*
time complexity: O(n)
space complexity: O(n)
thought process: bfs
postion of node
       1
      / \
     2   3
    / \ / \
   4  5 6  7
   left neighbor: position -> position * 2
   right neighbor: position -> position * 2 + 1
   width : R - L + 1
*/
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> qIndex = new LinkedList<>();

        q.offer(root);
        qIndex.offer(1);
        int width = 1;

        while(!q.isEmpty()) {
            int size = q.size();
            int left = 0;
            int right = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                int index = qIndex.poll();

                if(i == 0)
                    left = index;
                
                if (i == size - 1)
                    right = index;

                if(node.left != null) {
                    q.offer(node.left);
                    qIndex.offer(index * 2);
                }

                if (node.right != null) {
                    q.offer(node.right);
                    qIndex.offer(index * 2 + 1);
                }
                
            }

            width = Math.max(width, right - left + 1);
        }
        return width;
    }
}