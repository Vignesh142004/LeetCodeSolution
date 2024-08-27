class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int r1=items1.length;
        int r2=items2.length;
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        for(int i=0;i<r1;i++)
        {
            if(hm.containsKey(items1[i][0]))
            {
                hm.put(items1[i][0],hm.get(items1[i][0])+items1[i][1]);
            }
            else
            {
                hm.put(items1[i][0],items1[i][1]);
            }
        }
        for(int i=0;i<r2;i++)
        {
            if(hm.containsKey(items2[i][0]))
            {
                hm.put(items2[i][0],hm.get(items2[i][0])+items2[i][1]);
            }
            else
            {
                hm.put(items2[i][0],items2[i][1]);
            }
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            ans.add(new ArrayList<>(Arrays.asList(m.getKey(),m.getValue())));
        }
        return ans;
        
    }
}