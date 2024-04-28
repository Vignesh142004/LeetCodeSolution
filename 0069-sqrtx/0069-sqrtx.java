
class Solution {
    public int mySqrt(int x) {
        int first=1;
        int last=x;
        while(first<=last)
        {
            int mid=(first+last)/2;
            if(x/mid==mid)
            {
                return mid;
            }
            else if(x/mid<mid)
            {
                last=mid-1;
            }
            else
            {
                first=mid+1;
            }
            
        }
        return last;
        
        
    }
}