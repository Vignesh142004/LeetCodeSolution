class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n%2==0 && m%2==0)
        {
            return 0;
        }
        int xor=0;
        if(n%2==0 && m%2==1)
        {
            for(int i=0;i<n;i++)
            {
                xor=xor^nums1[i];
            }
        }
        if(n%2==1 && m%2==0)
        {
            for(int i=0;i<m;i++)
            {
                xor=xor^nums2[i];
            }
        }
        if(n%2==1 && m%2==1)
        {
            for(int i=0;i<m;i++)
            {
                xor=xor^nums2[i];
            }
            for(int i=0;i<n;i++)
            {
                xor=xor^nums1[i];
            }
        }

        return xor;


        
    }
}