class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int cost[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    cost[i][j]=0;
                }
                else
                {
                    cost[i][j]=(int)1e8;
                }
            }
        }
        int r=edges.length;
        for(int i=0;i<r;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            int wt=edges[i][2];
            cost[u][v]=wt;
            cost[v][u]=wt;
        }
        for(int k=0;k<n;k++)
        {
             for(int i=0;i<n;i++)
             {
                for(int j=0;j<n;j++)
                {
                    cost[i][j]=Math.min(cost[i][j],cost[i][k]+cost[k][j]);
                }
             }
        }
        int mincount=n;
        int idx=-1;
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<n;j++)
            {
               if(cost[i][j]<=distanceThreshold)
               {
                   count++;
               }
            }
            if(count<=mincount)
            {
                mincount=count;
                idx=i;
            }
        }
        return idx;
        
    }
}