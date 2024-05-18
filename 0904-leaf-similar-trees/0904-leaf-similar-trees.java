/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> ans1 = new ArrayList<>();
    List<Integer> ans2 = new ArrayList<>();

    void func1(TreeNode root1) {
        if (root1 == null) {
            return;
        }
        if (root1.left == null && root1.right==null) 
        {
            ans1.add(root1.val);   
    }
    func1(root1.left);
    func1(root1.right);
    }


    void func2(TreeNode root2) {
        if (root2 == null) {
            return;
        }
        if(root2.left==null && root2.right==null)
        {
            ans2.add(root2.val);
        }
        func2(root2.left);
        func2(root2.right);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        func1(root1);
        func2(root2);
        if (ans1.size() != ans2.size()) {
            return false;
        }
        return ans1.equals(ans2);

    }
}