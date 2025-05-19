class Solution {
    public int smallestIndex(int[] nums) 
    {
        int n=nums.length;
        int ans=-1;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
            int sum=0;
            while(a!=0)
            {
                int rem=a%10;
                sum=sum+rem;
                a=a/10;
            }
            if(sum==i)
            {
                ans=i;
                break;
            }
        }
        return ans;
        
    }
}