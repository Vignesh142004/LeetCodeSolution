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
            return;
        }
        func(root.left,arr);
        arr.add(root.val);
        func(root.right,arr);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arr=new ArrayList<>();
        func(root,arr);
        HashSet<Integer> hs=new HashSet<>();
        for(int a:arr)
        {
            int targer=k-a;
            if(hs.contains(targer))
            {
                return true;
            }
            else
            {
                hs.add(a);
            }
        }
        return false;
        
        
    }
}