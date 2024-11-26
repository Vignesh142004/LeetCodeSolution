class Solution {
    public int findChampion(int n, int[][] edges) {
        //int adj[][]=new int[n][n];
        int indegree[]=new int[n];
        int len=edges.length;
        for(int i=0;i<len;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            indegree[v]++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                ans.add(i);
            }
        }
        if(ans.size()>1)
        {
        return -1;
        }
        return ans.get(0);

        
    }
}