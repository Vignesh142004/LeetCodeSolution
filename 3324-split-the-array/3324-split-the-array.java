class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
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
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()>2)
            {
                return false;
            }
            continue;
        }
        return true;

        
    }
}