class Solution {
    public int removeDuplicates(int[] nums) {
        /*int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<=nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                     count++;
                }
            }
        }
        return count;*/
        int n=nums.length;
         if (n == 0 || n == 1) {
            return n;
        }
 
        int j = 0;
 
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[j++] = nums[i];
            }
        }
 
        nums[j++] = nums[n - 1];
 
        return j;
        
    }
}