class Solution {
    public int maxProduct(int n) 
    {
        List<Integer> arr=new ArrayList<>();
        while(n>0)
        {
            int rem=n%10;
            arr.add(rem);
            n=n/10;
        }
        int fmax=Integer.MIN_VALUE;
        int idx=-1;
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)>fmax)
            {
                fmax=arr.get(i);
                idx=i;
            }
        }
        arr.set(idx,Integer.MIN_VALUE);
        int smax=Integer.MIN_VALUE;
        for(int a:arr)
        {
            smax=Math.max(smax,a);
        }
        int ans=fmax*smax;
        return ans;
    }
}