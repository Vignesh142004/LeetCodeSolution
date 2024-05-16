class Solution {
    public int countLatticePoints(int[][] circles) {
        int n=circles.length;
        int ans=0;
        for(int i=0;i<=200;i++)
        {
            for(int j=0;j<=200;j++)
            {
                for(int k=0;k<n;k++)
                {
                    int x=circles[k][0];
                    int y=circles[k][1];
                    int z=circles[k][2];
                    if((x-i)*(x-i)+(y-j)*(y-j)<=z*z)
                    {
                        ans++;
                        break;
                    }
                }
            }
        }
        return ans;
        
    }
}