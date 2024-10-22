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
    int count=0;
    int move(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=move(root.left);
        int right=move(root.right);
        count=count+Math.abs(left)+Math.abs(right);
        return root.val+left+right-1;
    }
    public int distributeCoins(TreeNode root) {
        move(root);
        return count;  
    }

}