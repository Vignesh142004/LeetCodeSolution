class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> minr=new ArrayList<>();
        List<Integer> maxc=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++)
            {
               min=Math.min(matrix[i][j],min);
            }
            minr.add(min);
        }
        for(int i=0;i<m;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int k=0;k<n;k++)
            {
               max=Math.max(matrix[k][i],max);
            }
            maxc.add(max);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<minr.size();i++)
        {
           if(maxc.contains(minr.get(i)))
           {
            ans.add(minr.get(i));
           }
        }
        System.out.println(minr);
        System.out.println(maxc);
        
        return ans;
        
    }
}