/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode func(TreeNode clone,int val)
    {
        if(clone==null)
        {
            return clone;
        }
        if(clone.val==val)
        {
            return clone;
        }
        TreeNode ans1=func(clone.left,val);
        TreeNode ans2=func(clone.right,val);
        if(ans1!=null)
        {
            return ans1;
        }
        return ans2;
    }
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        int a=target.val;
        TreeNode ans=func(cloned,a);
        return ans;

        
    }
}