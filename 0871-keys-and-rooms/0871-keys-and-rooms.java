class Solution {
    static boolean bfs(List<List<Integer>> arr)
    {
        int n=arr.size();
        int m=arr.get(0).size();
        int visit[]=new int[n];
        int st=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(st);
        visit[st]=1;
        while(q.size()!=0)
        {
            int x=q.peek();
            q.remove();
            for(int i=0;i<arr.get(x).size();i++)
            {
                if(arr.get(x).get(i)!=0 && visit[arr.get(x).get(i)]==0)
                {
                    q.add(arr.get(x).get(i));
                    visit[arr.get(x).get(i)]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(visit[i]==0)
            {
                return false;
            }
        }
        return true;
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean ans=bfs(rooms);
        return ans;
        
    }
}