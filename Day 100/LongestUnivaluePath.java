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

    int longest = 0;
    public int longestUnivaluePath(TreeNode root) {
    
        if(root==null) {
            return 0;
        }
        helpMethod(root,root.val);
        return longest;
    }

    public int helpMethod(TreeNode node,int value) {
        
        if(node == null) {
            return 0;
        }
        int leftpath = helpMethod(node.left,node.val);
        int rightpath = helpMethod(node.right,node.val);
        longest = Math.max(longest, leftpath+rightpath);
        if(node.val==value) {
            return Math.max(leftpath,rightpath)+1;
        }
        return 0;
    }
}