class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        long sum=0;
        long ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(nums[i]<0 && nums[j]<0 && nums[k]<0)
                    {
                        sum=0;
                        continue;
                    }
                    else{
                    sum=(nums[i]-nums[j])*(long)nums[k];
                    ans=Math.max(ans,sum);
                    }

                }
            }
        }
        return ans;
        
    }
}