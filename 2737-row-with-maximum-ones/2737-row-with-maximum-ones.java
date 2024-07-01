class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int ans[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
            hm.put(i,count);
        }
        int max=0;
        int row=0;
        for(Map.Entry<Integer,Integer> a:hm.entrySet())
        {
             if(a.getValue()>max)
             {
                max=a.getValue();
                row=a.getKey();
             } 
        }
        ans[0]=row;
        ans[1]=max;
        return ans;


        
    }
}