class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[n-1];
        int sum=a;
        for(int i=1;i<k;i++)
        {
           a=a+1;
           sum=sum+a;
           
        }
        return sum;
        
    }
}