class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2];
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
        int i=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            
            if(m.getValue()==1)
            {
                ans[i++]=m.getKey();
            }
        }
        return ans;
        
    }
}