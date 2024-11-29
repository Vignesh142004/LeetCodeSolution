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
    static void func(TreeNode root,List<Integer> arr)
    {
        if(root==null)
        {
            return;
        }
        func(root.left,arr);
        arr.add(root.val);
        func(root.right,arr);
    }
    public int[] findMode(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        func(root,arr);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(Integer a:arr)
        {
            if(hm.containsKey(a))
            {
                hm.put(a,hm.get(a)+1);
            }
            else
            {
                hm.put(a,1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            max=Math.max(max,m.getValue());
        }
        List<Integer> lt=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==max)
            {
                lt.add(m.getKey());
            }
        }
        int len=lt.size();
        int ans[]=new int[len];
        for(int i=0;i<len;i++)
        {
            ans[i]=lt.get(i);
        }
        return ans;  
    }
}