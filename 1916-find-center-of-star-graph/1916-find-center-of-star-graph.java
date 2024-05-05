class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        int m=edges[0].length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(hm.containsKey(edges[i][j]))
                {
                    hm.put(edges[i][j],hm.get(edges[i][j])+1);
                }
                else
                {
                    hm.put(edges[i][j],1);
                }
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer> e:hm.entrySet())
        {
            //max=Math.max(max,e.getValue());
            if(e.getValue()==n)
            {
                return e.getKey();
            }
        }
        return 0;
        
    }
}