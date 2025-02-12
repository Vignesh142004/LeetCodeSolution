class Solution {
    static int sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int n=nums.length;
        int max=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int s1=sum(nums[i]);
            if(hm.containsKey(s1))
            {
                int val=hm.get(s1);
                max=Math.max(max,(nums[i]+val));
                hm.put(s1,Math.max(val,nums[i]));
            }
            else
            {
                hm.put(s1,nums[i]);
            }
        }
        return max;
        
    }
}