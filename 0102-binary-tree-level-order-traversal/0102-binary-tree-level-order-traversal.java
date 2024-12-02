/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        traversal(root, 0);
        return result;
    }

    public void traversal(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        depth++;
        if (result.size() < depth) {
            List<Integer> itemList = new ArrayList<>();
            result.add(itemList);
        }
        result.get(depth - 1).add(root.val);

        traversal(root.left, depth);
        traversal(root.right, depth);
    }
}