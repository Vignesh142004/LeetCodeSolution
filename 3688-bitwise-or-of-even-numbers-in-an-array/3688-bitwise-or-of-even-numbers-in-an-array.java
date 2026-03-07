class Solution {
    public int evenNumberBitwiseORs(int[] nums) {

        int ans=0;
        for(int a:nums)
        {
            if(a%2==0)
            {
                ans=ans|a;
            }
        }
        return ans;
        
    }
}