class Solution {
    public int[] getFinalState(int[] arr, int k, int mul) {
        int n=arr.length;
        while(k!=0)
        {
            int min=Integer.MAX_VALUE;
            int idx=-1;
            for(int i=0;i<n;i++)
            {
                if(arr[i]<min)
                {
                    min=arr[i];
                    idx=i;
                }
            }
            if(idx==-1)
            {
                continue;
            }
            else
            {
                arr[idx]=mul*arr[idx];
            }
            k--;
        }
        return arr;
        
    }
}