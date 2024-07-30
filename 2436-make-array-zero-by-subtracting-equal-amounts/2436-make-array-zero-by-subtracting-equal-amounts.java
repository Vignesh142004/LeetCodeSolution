class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int a:nums)
        {
            if(hm.containsKey(a))
            {
                hm.put(a,hm.get(a)+1);
            }
            else
            {
                hm.put(a,1);
            }
        }
        int count=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getKey()!=0)
            {
                count++;
            }
        }
        return count;
      
    }
}