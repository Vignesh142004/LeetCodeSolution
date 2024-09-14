class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        int n=nums.length;
        helper(0,n,ls,a,nums);
        return ls;
        
    }
    void helper(int i,int n,List<List<Integer>> ls,List<Integer> a,int nums[])
    {
        if(i==n)
        {
            ls.add(new ArrayList(a));
            return;
        }
        a.add(nums[i]);
        helper(i+1,n,ls,a,nums);
        a.remove(a.size()-1);
        helper(i+1,n,ls,a,nums);
    }
}