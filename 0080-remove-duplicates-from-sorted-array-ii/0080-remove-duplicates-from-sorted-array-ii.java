class Solution {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        for(int a:nums)
        {
            if(ans<2||a>nums[ans-2])
            {
                nums[ans++]=a;
            }
        }
        return ans;
        
    }
}