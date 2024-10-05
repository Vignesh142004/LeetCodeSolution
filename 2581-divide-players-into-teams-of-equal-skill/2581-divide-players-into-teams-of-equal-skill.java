class Solution {
    public long dividePlayers(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        int val=arr[0]+arr[n-1];
        long ans=0;
        int i=0;
        int j=n-1;
        int count=0;
        while(i<=j)
        {
            int a=arr[i]+arr[j];
            int b=arr[i]*arr[j];
            if(val==a)
            {
               ans=ans+b;
               count++; 
            }
            i++;
            j--;
        }
        if(count!=(n/2))
        {
            return -1;
        }
        return ans;
        

        
    }
}