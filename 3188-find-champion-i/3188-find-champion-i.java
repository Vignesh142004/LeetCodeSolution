class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    count++;
                }
            }
            hm.put(i,count);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> a:hm.entrySet())
        {
            max=Math.max(a.getValue(),max);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> a:hm.entrySet())
        {
            if(a.getValue()==max)
            {
                ans=a.getKey();
            }
        }
        return ans;
        
    }
}