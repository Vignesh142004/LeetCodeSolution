class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int ans=(nums[i]|nums[j])&1;
                if(ans==0)
                {
                    count++;
                }
            }
        }
        if(count!=0)
        {
            return true;
        }
        return false;
        
    }
}