class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int esum=0;
        for(int i=0;i<n;i++)
        {
            esum=esum+nums[i];

        }
        int dsum=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=9)
            {
                dsum=dsum+nums[i];
            }
            else
            {
                while(nums[i]>0)
                {
                    dsum=dsum+(nums[i]%10);
                    nums[i]/=10;
                }
            }

        }
        return esum-dsum;
        
    }
}