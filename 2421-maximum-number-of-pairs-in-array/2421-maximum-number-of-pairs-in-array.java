class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2];
        int a=-1;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]==nums[j] && nums[i]>=0 && nums[j]>=0)
                {
                    count++;
                    nums[i]=a--;
                    nums[j]=a--;
                }
            }
        }
        ans[0]=count;
        int rem=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>=0)
            {
                rem++;
            }
        }
        ans[1]=rem;
        return ans;

        
    }
}