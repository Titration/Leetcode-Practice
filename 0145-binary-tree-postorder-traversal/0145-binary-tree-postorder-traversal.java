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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.push(root);
        while (!deque.isEmpty()) {
            TreeNode curr = deque.pop();
            result.add(curr.val);
            if (curr.left != null) {
                deque.push(curr.left);
            }
            if (curr.right != null) {
                deque.push(curr.right);
            }
        }
        
        int left = 0, right = result.size() - 1;
        while (left < right) {
            int temp = result.get(left);
            result.set(left, result.get(right));
            result.set(right, temp);
            left++;
            right--;
        }
        return result;
    }
}