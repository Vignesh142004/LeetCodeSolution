class Solution {
    int func(int i,int x,int a[],int n)
    {
        if(i==n)
        {
            return x;
        }
        int ans1=func(i+1,x^a[i],a,n);
        int ans2=func(i+1,x,a,n);
        return ans1+ans2;

    }
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        int i=0;
        int x=0;
        int res= func(i,x,nums,n);
        return res;
        
    }
}