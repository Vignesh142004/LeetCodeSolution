class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==m.getKey())
            {
                ans.add(m.getKey());
            }
        }
        Collections.sort(ans);
        if(ans.size()==0)
        {
            return -1;
        }
        return ans.get(ans.size()-1);
        
    }
}