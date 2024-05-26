class Solution {
    public int duplicateNumbersXOR(int[] nums) {
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
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==2)
            {
                arr.add(m.getKey());
            }
        }
        if(arr.size()==0)
        {
            return 0;
        }
        int ans=arr.get(0);
        for(int i=1;i<arr.size();i++)
        {
            ans=ans^arr.get(i);
        }
        return ans;
       
        
    }
}