class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
          return true;
        }
            for(int j=0;j<n-1;j++)
            {
                int k=j+1;
                if((nums[j]+nums[k])%2==0)
                {
                    return false;
                }
            }
        return true;
        
    }
}