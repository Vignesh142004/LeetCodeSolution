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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        func(root,arr);
        Collections.sort(arr);
        List<Integer> temp=new ArrayList<>();
        int j=0;
        for(int i=0;i<arr.size()-1;i++)
        {
            if(arr.get(i)!=arr.get(i+1))
            {
                temp.add(arr.get(i));
            }
        }
        temp.add(arr.get(arr.size()-1));
        System.out.println(temp);
        if(temp.size()<=1)
        {
            return -1;
        }
        int ans=temp.get(1);
        if(temp.get(0)==2147483647)
        {
            return -1;
        }
        if(ans==2147483646)
        {
            return 2147483647;
        }
        return ans;

        
    }
}