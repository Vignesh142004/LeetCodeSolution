class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr.add(index[i],nums[i]);
        }
        for(int i=0;i<n;i++)
        {
          ans[i]=arr.get(i);
        }
        return ans;
        
    }
}