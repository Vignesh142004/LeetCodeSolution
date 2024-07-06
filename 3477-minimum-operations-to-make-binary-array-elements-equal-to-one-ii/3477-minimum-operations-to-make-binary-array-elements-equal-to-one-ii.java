class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int val=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==val){
                count++;
                val=1-val;
            }
        }
        return count;
        
    }
}