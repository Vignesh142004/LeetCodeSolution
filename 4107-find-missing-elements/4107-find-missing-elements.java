class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList();
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[n-1];
        for(int i=a;i<=b;i++)
        {
            boolean flag=false;
            for(int j=0;j<n;j++)
            {
                if(nums[j]==i)
                {
                    flag=true;
                }
            }
            if(!flag)
            {
                ans.add(i);
            }
        }
        return ans;
        
    }
}