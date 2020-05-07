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
  
    List<String> result = new ArrayList<String>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        
        String path = "";
        helpMethod(root,path);
        return result;
    }  
    public void helpMethod(TreeNode root ,String path) {
            
        if(root == null) {
             return ;
         }
        path = path + root.val;
        if(root.left == null && root.right == null) {
            result.add(path);
           
        }
        path = path + "->";
        helpMethod(root.left,path);
        helpMethod(root.right,path);
    }
}