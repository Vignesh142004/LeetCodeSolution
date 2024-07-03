class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=(nums[i]*2);
                nums[i+1]=0;
            }
        }
        int ans[]=new int[n];
        int a=0;
        int b=n-1;
        for(int i=0;i<n;i++)
        {
           if(nums[i]==0)
           {
            ans[b--]=nums[i];
           }
           else
           {
            ans[a++]=nums[i];
           }
        }
        return ans;
        
    }
}