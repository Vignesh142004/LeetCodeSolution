class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int max=-1;
        if(n==k)
        {
            for(int i=0;i<n;i++)
            {
                max=Math.max(max,nums[i]);
            }
            return max;
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<=n-k;i++)
        {
            for(int j=i;j<i+k;j++)
            {
                if(hm.containsKey(nums[j]))
                {
                    hm.put(nums[j],hm.get(nums[j])+1);
                }
                else
                {
                    hm.put(nums[j],1);
                }
            }
        }
        
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
                max=Math.max(max,m.getKey());
            }
        }
        return max;
       
        
    }
}