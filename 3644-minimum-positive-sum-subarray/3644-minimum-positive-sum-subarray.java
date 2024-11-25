class Solution {
    static int func(List<Integer> arr,int l,int r)
    {
        int sum=0;
        for(int i=l;i<=r;i++)
        {
            sum+=arr.get(i);
        }
        return sum;
    }
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int val=func(nums,i,j);
                int len=Math.abs(j-i)+1;
                if(len>=l &&len<=r && val>0)
                {
                  min=Math.min(val,min);
                }
            }
        }
        if(min==Integer.MAX_VALUE)
        {
            return -1;
        }
        return min;
        
    }
}