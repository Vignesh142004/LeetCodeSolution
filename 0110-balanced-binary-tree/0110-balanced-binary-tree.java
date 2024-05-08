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
    int height(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            return 1+Math.max(height(root.left),height(root.right));
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        int lh;
        int rh;
        lh=height(root.left);
        rh=height(root.right);
        if(Math.abs(lh-rh)<=1 && isBalanced(root.left) && isBalanced(root.right))
        {
            return true;
        }
        return false;
        
        
        
    }
}