class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                pos.add(nums[i]);
            }
            else
            {
                neg.add(nums[i]);
            }
        }
        int a=0;
        int b=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                ans[i]=pos.get(a++);
            }
            else{
            ans[i]=neg.get(b++);
            }
        }
        return ans;

        
    }
}