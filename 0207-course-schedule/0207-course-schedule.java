class Solution {
    boolean toposort(int adj[][],int n)
    {
        int indegree[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(adj[i][j]==1)
                {
                    indegree[j]++;
                }
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        while(q.size()!=0)
        {
            int x=q.peek();
            q.remove();
            for(int i=0;i<n;i++)
            {
                if(adj[x][i]==1)
                {
                    indegree[i]--;
                    if(indegree[i]==0)
                    {
                        q.add(i);
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==1)
            {
                return false;
            }
        }
        return true;

    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=numCourses;
        int row=prerequisites.length;
        int adj[][]=new int[n][n];
        for(int i=0;i<row;i++)
        {
            adj[prerequisites[i][0]][prerequisites[i][1]]=1;
        }
        boolean ans=toposort(adj,n);
        return ans;

       


        
    }
}