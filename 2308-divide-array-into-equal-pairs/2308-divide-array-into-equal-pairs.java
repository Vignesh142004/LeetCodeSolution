class Solution {
    public boolean divideArray(int[] nums) {
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
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()%2!=0)
            {
                return false;
            }
        }
        return true;
        
    }
}