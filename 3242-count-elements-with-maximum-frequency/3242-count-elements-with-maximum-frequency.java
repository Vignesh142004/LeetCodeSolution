class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            max=Math.max(m.getValue(),max);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==max)
            {
               ans=ans+m.getValue();
            }
        }
        return ans;

        
    }
}