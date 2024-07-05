class Solution {
    public int mostFrequentEven(int[] nums) {
       List<Integer> arr=new ArrayList<>();
       for(int i=0;i<nums.length;i++)
       {
          if(nums[i]%2==0)
          {
            arr.add(nums[i]);
          }
       }
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int a:arr)
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
       List<Integer> ans=new ArrayList<>();
       int max=0;
       for(Map.Entry<Integer,Integer> m:hm.entrySet())
       {
           if(m.getValue()>max)
           {
              max=m.getValue();
           }
       }
       for(Map.Entry<Integer,Integer> g:hm.entrySet())
       {
           if(g.getValue()==max)
           {
              ans.add(g.getKey());
           }
       }
       Collections.sort(ans);
       
       if(ans.size()==0)
       {
        return -1;
       }
       return ans.get(0);
        
        
    }
}