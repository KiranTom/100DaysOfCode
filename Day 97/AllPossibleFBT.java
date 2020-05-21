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
    public List<TreeNode> allPossibleFBT(int N) {
        
        List<TreeNode> myList = new ArrayList<>(); 
        if(N <= 0 || N % 2 == 0) {
            return myList;
        }
        List<TreeNode> result = new ArrayList<>();
        if(N == 1) {
            TreeNode node = new TreeNode(0);
            result.add(node);
            return result;
        }
        for(int i = 1; i < N; i += 2) {
            
            List<TreeNode> left = new ArrayList<>();
            List<TreeNode> right = new ArrayList<>();
            
            left = allPossibleFBT(i);
            right = allPossibleFBT(N-i-1);
            
            for(TreeNode l : left) {
                
                for(TreeNode r : right) {
                    
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    result.add(root);
                }
            }
        }
        return result;
    }
}