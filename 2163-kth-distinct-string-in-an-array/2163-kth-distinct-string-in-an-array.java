class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm=new LinkedHashMap<>();
        for(String a:arr)
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
        List<String> ans=new ArrayList<>();
        for(Map.Entry<String,Integer> m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
                ans.add(m.getKey());
            }
        }
        if(ans.size()<k)
        {
            return "";
        }
        return ans.get(k-1);
        
    }
}