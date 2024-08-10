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
    void func(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return ;
        }
        func(root.left,arr);
        arr.add(root.val);
        func(root.right,arr);
    }
        
    public boolean isValidBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        func(root,arr);
        for(int i=1;i<arr.size();i++)
        {
            if(arr.get(i)>arr.get(i-1))
            {
                continue;
            }
            return false;
        }
        return true;

        
    }
}