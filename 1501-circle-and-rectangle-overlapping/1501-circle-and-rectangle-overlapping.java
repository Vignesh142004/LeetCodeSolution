class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        x1=x1-xCenter;
        x2=x2-xCenter;
        y1=y1-yCenter;
        y2=y2-yCenter;
        for(int i=x1;i<=x2;i++)
        {
            for(int j=y1;j<=y2;j++)
            {
                if((i*i)+(j*j)<=(radius*radius))
                {
                    return true;
                }
            }
        }
        return false;
        



        
        
    }
}