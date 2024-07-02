class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ans=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j] && nums1[i]>=0 &&nums2[j]>=0)
                {
                    ans.add(nums2[j]);
                    nums2[j]=-1;
                    nums1[i]=-1;
                    break;
                    
                }
            }
        }
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
        
    }
}