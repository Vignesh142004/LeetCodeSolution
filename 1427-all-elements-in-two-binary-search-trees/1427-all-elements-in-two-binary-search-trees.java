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
    void func1(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        func1(root.left,arr);
        arr.add(root.val);
        func1(root.right,arr);
    }
    void func2(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        func2(root.left,arr);
        arr.add(root.val);
        func2(root.right,arr);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr=new ArrayList<>();
        func1(root1,arr);
        func2(root2,arr);
        Collections.sort(arr);
        return arr;

        
    }
}