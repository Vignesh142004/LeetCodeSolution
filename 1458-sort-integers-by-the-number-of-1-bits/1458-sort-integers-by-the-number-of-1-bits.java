class Solution {
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int bit[]=new int[n];
        for(int i=0;i<n;i++)
        {
            bit[i]=Integer.bitCount(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(bit[j]>bit[j+1])
                {
                    int temp1=bit[j+1];
                    bit[j+1]=bit[j];
                    bit[j]=temp1;
                    int temp2=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp2;
                }
            }
        }
        return arr;
        
    }
}