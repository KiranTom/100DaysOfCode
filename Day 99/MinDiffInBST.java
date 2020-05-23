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
    
    TreeNode node = null;
    int difference = Integer.MAX_VALUE;
    
    public int minDiffInBST(TreeNode root) {
        
        if (root == null) {
            return difference;
        }
        minDiffInBST(root.left);
        if (node != null) {
            difference = Math.min(difference, root.val-node.val);
        }
        node = root;
        minDiffInBST(root.right);
        
        return difference;
    }
}
