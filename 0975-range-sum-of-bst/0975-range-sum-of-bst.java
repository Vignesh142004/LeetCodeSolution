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
        func(root.right,arr);
        arr.add(root.val);
        
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> arr=new ArrayList<>();
        func(root,arr);
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>=low && arr.get(i)<=high)
            {
                sum=sum+arr.get(i);
            }
        }
        return sum;   
    }
}