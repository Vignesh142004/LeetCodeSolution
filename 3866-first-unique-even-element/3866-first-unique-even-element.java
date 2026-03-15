class Solution {
    public int firstUniqueEven(int[] nums) {
       HashMap<Integer,Integer> hm=new LinkedHashMap<>();
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

       for(Map.Entry<Integer,Integer> m:hm.entrySet())
       {
           if(m.getValue()==1 && m.getKey()%2==0)
           {
              return m.getKey();
           }
       }
       return -1;
        
    }
}