class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n=position.length;
        int low=0;
        int high=1000000000;
        int ans=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int lastposition=position[0];
            int balls=1;
            for(int i=1;i<n;i++)
            {
               if(position[i]-lastposition>=mid)
               {
                  lastposition=position[i];
                  balls=balls+1;
               }
            }
            if(balls>=m)
            {
                ans=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }
        return ans;



        
    }
}