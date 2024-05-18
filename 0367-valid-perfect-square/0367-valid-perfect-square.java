class Solution {
    public boolean isPerfectSquare(int num) {
        int first=0;
        int last=num;
        int mid;
        while(first<=last)
        {
           mid=first+(last-first)/2;
            if(num/(double)mid==(double)mid)
            {
                return true;
            }
            else if(num/(double)mid<mid)
            {
                last=mid-1;
            }
            else
            {
                first=mid+1;
            }
        }
        return false;
        
    }
}