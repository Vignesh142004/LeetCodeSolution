class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            int flag=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                arr1.add(nums1[i]);
            }
        } 
        for(int i=0;i<nums2.length;i++)
        {
            int flag=0;
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                arr2.add(nums2[i]);
            }
        }
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int a:arr1)
        {
            hs1.add(a);
        }
        for(int b:arr2)
        {
            hs2.add(b);
        }
        List<Integer> c=new ArrayList<>(hs1);
        List<Integer> d=new ArrayList<>(hs2);
        ans.add(c);
        ans.add(d);
        return ans;
        
    }
}