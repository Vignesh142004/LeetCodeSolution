class Solution {
    public int xorOperation(int n, int start) {
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=start+(2*i);
        }
        int ans=a[0];
        for(int i=1;i<n;i++)
        {
            ans^=a[i];
        }
         return ans;


        
    }
   
}