class Solution {
    List<List<Integer>> result;
    
    public List<List<Integer>> levelOrder(Node root) {
        result = new ArrayList<>();
        dfs(root, 0);
        return result;
    }
    
    private void dfs(Node root, int depth) {
        if (root != null) {
            if (result.size() < depth + 1) result.add(new ArrayList());
            result.get(depth).add(root.val);
            depth++;
            for(Node child: root.children) {
                dfs(child, depth);
            }
        }
    }
}