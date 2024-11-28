class Solution {
      static boolean isprime(int n)
       {
            if(n<2)
            {
                return false;
            }
            for(int j=2;j<=Math.sqrt(n);j++)
            {
                if(n%j==0)
                {
                   return false;
                }
            }
            return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(isprime(nums[i]))
            {
                arr.add(i);
            }
        }
        int ans=0;
        Collections.sort(arr);
        if(arr.size()==1)
        {
            return 0;
        }
        else
        {
            ans=arr.get(arr.size()-1)-arr.get(0);
        }
        return ans;
        
    }
}