class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=0;
        int j=n-1;
        int max=Integer.MIN_VALUE;
        while(i<=j)
        {
            int sum=nums[i]+nums[j];
            max=Math.max(sum,max);
            i++;
            j--;
        }
        return max;
        
    }
}