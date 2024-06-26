class Solution {
    public int largestCombination(int[] nums) {
        int n=nums.length;
        int bin[]=new int[32];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<32;j++)
            {
                int temp=nums[i]&(1<<j);
                if(temp!=0)
                {
                    bin[j]=bin[j]+1;
                }  
            }
        }
        int max=0;
        for(int i=0;i<32;i++)
        {
            max=Math.max(max,bin[i]);
        }
        return max;





        
    }
}