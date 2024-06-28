class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int a[]=new int[n*n];
        int ans[]=new int[2];
        int b=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[b++]=grid[i][j];
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
           sum=sum+a[i];
           if(hm.containsKey(a[i]))
           {
            hm.put(a[i],hm.get(a[i])+1);
           }
           else
           {
            hm.put(a[i],1);
           }
        }
        int repeat=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==2)
            {
                repeat=m.getKey();
            }
        }
        int sum2=0;
        for(int i=1;i<=(n*n);i++)
        {
            sum2=sum2+i;
        }
        int missing=sum2-(sum-repeat);
        ans[0]=repeat;
        ans[1]=missing;
        return ans;

        
    }
}