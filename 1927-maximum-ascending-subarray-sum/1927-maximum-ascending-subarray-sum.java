class Solution {
    static int func(int a,int b,int arr[])
    {
        int sum=arr[a];
        for(int i=a;i<b;i++)
        {
            if(arr[i]<arr[i+1])
            {
                sum+=arr[i+1];
            }
            else
            {
                break;
            }
        }
        return sum;
    }
    public int maxAscendingSum(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int val=func(i,j,nums);
                ans=Math.max(ans,val);
            }
        }
        return ans;
        
    }
}