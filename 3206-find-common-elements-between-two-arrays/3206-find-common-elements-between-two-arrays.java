class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int ans[]=new int[2];
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count1++;
                    break;
                }
            }
        }
        for(int j=0;j<m;j++)
        {
            for(int i=0;i<n;i++)
            {
                if(nums2[j]==nums1[i])
                {
                    count2++;
                    break;
                }
            }
        }
        ans[0]=count1;
        ans[1]=count2;
        return ans;
        
    }
}