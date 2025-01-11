class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int n=arr.length;
        if(n==1)
        {
            return 0;
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                continue;
            }
           return i;
        }
         return n-1; 
        
    }
}