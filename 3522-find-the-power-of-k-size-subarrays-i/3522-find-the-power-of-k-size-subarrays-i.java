class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[(n-k)+1];
        if(n==k && n==2)
        {
            ans[0]=nums[1];
            return ans;
        }
        if(k==1)
        {
            return nums;
        }
        for(int i=0;i<=(n-k);i++)
        {
            int max=0;
            int flag=0;
            for(int j=i+1;j<(i+k);j++)
            {
                max=Math.max(max,nums[j]);
                if(nums[j-1]>=nums[j] || (nums[j-1]+1)!=nums[j])
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=max;
            }
        }
        return ans;
        
    }
}