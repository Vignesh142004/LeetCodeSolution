class Solution {
    public int findJudge(int n, int[][] trust) {
        int row=trust.length;
        int indegree[]=new int[n+1];
        int outdegree[]=new int[n+1];
        for(int i=0;i<row;i++)
        {
            indegree[trust[i][1]]++;
        }
        for(int i=0;i<row;i++)
        {
            outdegree[trust[i][0]]++;
        }
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==n-1 &&outdegree[i]==0 )
            {
                return i;
            }
        }
        return -1;
        
    }
}