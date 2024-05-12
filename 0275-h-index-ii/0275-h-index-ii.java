class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int target=n-mid;
            if(citations[mid]==target)
            {
                return citations[mid];
            }
            else if(citations[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return n-low;
        
    }
}