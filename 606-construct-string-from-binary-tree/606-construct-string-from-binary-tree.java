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
    String ans;

    void construct(TreeNode root) {
        if (root == null) return;
        ans += root.val;
        if (root.left == null && root.right == null) return;
        ans += '(';
        construct(root.left);
        ans += ')';
        if (root.right != null) {
            ans += '(';
            construct(root.right);
            ans += ')';
        }
    }

    public String tree2str(TreeNode root) {
        ans = "";
        construct(root);
        return ans;
    }
}
