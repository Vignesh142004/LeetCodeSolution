class Solution {
    public String findCommonResponse(List<List<String>> res) 
    {
        TreeMap<String,Integer> hm=new TreeMap<>();
        int r=res.size();
        for(int i=0;i<r;i++)
        {
            HashSet<String> hs=new HashSet<>();
            for(int j=0;j<res.get(i).size();j++)
            {
                hs.add(res.get(i).get(j));
            }
            for(String s:hs)
            {
                if(hm.containsKey(s))
                {
                    hm.put(s,hm.get(s)+1);
                }
                else
                {
                    hm.put(s,1);
                }
            }
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<String,Integer> m:hm.entrySet())
        {
            max=Math.max(max,m.getValue());
        }
        for(Map.Entry<String,Integer> m:hm.entrySet())
        {
            if(m.getValue()==max)
            {
                return m.getKey();
            }
        }
        return "";
    }
}