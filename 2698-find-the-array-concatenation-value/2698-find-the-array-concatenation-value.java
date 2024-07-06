class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        long ans=0;
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            if(i==j)
            {
                String s3=Long.toString(nums[j]);
                Long b=Long.parseLong(s3);
                ans=ans+b;
            }
            else
            {
            String s1=Long.toString(nums[i]);
            String s2=Long.toString(nums[j]);
            Long a=Long.parseLong((s1+s2));
            ans=ans+a;
            }
            i++;
            j--;
            
        }
        return ans;

        
    }
}