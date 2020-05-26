import java.awt.List;

class Solution {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> pathSum (TreeNode root, int sum) {
        LinkedList<Integer> track = new LinkedList<>();
        backtracking(root, sum, track);
        return result;
    }

    private void backtracking(TreeNode root, int target, LinkedList<Integer> track) {
        if (root == null) 
            return;

        track.add(root.val);
        if (root.left == null && root.right == null && root.val == target) {
            result.add(new ArrayList(track));
            return;
        } 

        backtracking(root.left, target - root.val, track);
        backtracking(root.right, target - root.val, track);
        
        track.removeLast();
    }
}

class Solution {
    List<List<Integer>> result = new LinkedList<>();
    int target;
    public List<List<Integer>> pathSum (TreeNode root, int sum) {
        target = sum;
        LinkedList<Integer> track = new LinkedList<>();
        backtracking(root,root.val,track);
        return result;
    }

    private void backtracking(TreeNode root, int sumPath, LinkedList<Integer> track) {
        if (root == null)
            return;
        
        track.add(root.val);

        if (root.left == null && root.right ==  null && sumPath == target) {
            result.add(new ArrayList(track));
            return;
        }

        backtracking(root.left, sumPath + root.val, track);
        backtracking(root.right, sumPath + root.val, track);

        track.removeLast();
        
    }
}