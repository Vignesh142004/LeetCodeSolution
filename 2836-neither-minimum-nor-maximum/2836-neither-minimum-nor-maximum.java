class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
        if(n<=2)
        {
            return -1;
        }
        int ans=nums[mid];
        
        return ans;
        
    }
}