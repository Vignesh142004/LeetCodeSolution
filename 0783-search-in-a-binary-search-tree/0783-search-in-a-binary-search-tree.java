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
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        {
          return root;
        }
        TreeNode ans1=searchBST(root.left,val);
        TreeNode ans2=searchBST(root.right,val);
        if(ans1!=null)
        {
            return ans1;
        }
        return ans2;
        
        
    }
}