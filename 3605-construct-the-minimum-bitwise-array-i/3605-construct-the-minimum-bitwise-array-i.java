class Solution {
    static int solve(int n)
    {
        int ans=-1;
        for(int i=0;i<=n;i++)
        {
            int val=i|(i+1);
            if(val==n)
            {
                ans=i;
                break;
            }
        }
        return ans;
    }
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int val=solve(nums.get(i));
            ans[i]=val;
        }
        return ans;
        
    }
}