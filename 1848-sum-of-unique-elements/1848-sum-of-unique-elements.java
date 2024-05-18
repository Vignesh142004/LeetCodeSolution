class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
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
        int sum=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
                sum=sum+m.getKey();
            }
        }
        return sum;
        
    }
}