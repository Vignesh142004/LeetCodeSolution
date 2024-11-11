class Solution {
    void helper(int i,int n,List<List<Integer>> ans,List<Integer> ls,int nums[])
    {
        if(i==n)
        {
            if(!ans.contains(ls))
            {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        ls.add(nums[i]);
        helper(i+1,n,ans,ls,nums);
        ls.remove(ls.size()-1);
        helper(i+1,n,ans,ls,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<Integer> ls=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,n,ans,ls,nums);
        return ans;
        
    }
}