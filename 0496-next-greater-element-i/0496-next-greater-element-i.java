class Solution {
    int next(int j,int nums2[])
    {
        for(int i=j;i<nums2.length;i++)
        {
            if(nums2[i]>nums2[j])
            {
                return nums2[i];
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int ans[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            int val=-1;
            for(int j=0;j<n2;j++)
            {
               if(nums1[i]==nums2[j])
               {
                  val=next(j,nums2);
               }
            }
            ans[i]=val;
        }
        return ans;
        
    }
}