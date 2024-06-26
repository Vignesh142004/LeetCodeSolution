class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m=arr2.length;
        int xor1=0;
        for(int i=0;i<n;i++)
        {
            xor1=xor1^arr1[i];
        }
        int xor2=0;
        for(int i=0;i<m;i++)
        {
            xor2=xor2^arr2[i];
        }
        int ans=xor1&xor2;
        return ans;
        
    }
}