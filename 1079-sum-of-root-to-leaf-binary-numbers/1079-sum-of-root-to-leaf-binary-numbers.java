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
    static int func(TreeNode root,int ans)
    {
        if(root==null)
        {
            return 0;
        }
        ans=2*ans+root.val;
        if(root.left==null&&root.right==null)
        {
            return ans;
        }
        else
        {
            return func(root.left,ans)+func(root.right,ans);
        }
    }
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        int ans=0;
        int result=func(root,ans);
        return result;
        
    }
}