class Solution {
    public int[] topKFrequent(int[] nums, int k) {
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
         List<Integer> arr=new ArrayList<>(hm.keySet());
          arr.sort((a,b)->hm.get(b).compareTo(hm.get(a)));
          List<Integer> ans=arr.subList(0,Math.min(k,arr.size()));
          int res[]=new int[ans.size()];
          for(int i=0;i<ans.size();i++)
         {
        res[i]=ans.get(i);
           }
    return res;
        
      
    }
}