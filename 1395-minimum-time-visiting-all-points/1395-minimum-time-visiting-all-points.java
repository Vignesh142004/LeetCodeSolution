class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        if(n==1)
        {
            return 0;
        }
        int res=0;
        for(int i=1;i<n;i++)
        {
          res=res+Math.max(Math.abs(points[i][0]-points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
        }
        return res;
        
    }
}