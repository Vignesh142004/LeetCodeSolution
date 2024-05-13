class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int k=n/3;
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
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()>k)
            {
               arr.add(m.getKey());
            }
        }
        return arr;
        
    }
}