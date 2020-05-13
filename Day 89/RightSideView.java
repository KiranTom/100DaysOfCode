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
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        if(root==null) {
            return result;
        }
        else {
            q.offer(root);
        }
        
        while(!q.isEmpty()) {
            
            int size = q.size();
            TreeNode node = null;
            
            for(int i=0; i<size; i++) {
                
                node = q.poll();
             
                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
            }
            result.add(node.val);
        }
        return result;
    }
}