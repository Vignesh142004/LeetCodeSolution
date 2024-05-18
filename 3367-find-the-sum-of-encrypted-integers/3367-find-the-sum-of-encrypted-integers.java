class Solution {
    int func(int n)
    {
        int sum=0;
        int p=0;
        while(n!=0)
        {
            sum=Math.max(sum,n%10);
            p=p*10+1;
            n=n/10;
        }
        return sum*p;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            ans=ans+func(nums[i]);
        }
        return ans;
        
    }
}