class Solution {
    public int absDifference(int[] nums, int k) {

        Arrays.sort(nums);
        int max=0;
        int min=0;

        for(int i=0;i<k;i++)
        {
            min=min+nums[i];
        }
         
        int len=nums.length-1;
        while(k>0)
        {
            max=max+nums[len];
            k--;
            len--;
        }

        return Math.abs(max-min);
        
    }
}