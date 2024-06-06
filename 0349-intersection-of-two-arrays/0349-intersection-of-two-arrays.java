class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> arr=new ArrayList<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    arr.add(nums1[i]);
                }
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            if(hm.containsKey(arr.get(i)))
            {
                hm.put(arr.get(i),hm.get(arr.get(i))+1);
            }
            else
            {
                hm.put(arr.get(i),1);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> f:hm.entrySet())
        {
            ans.add(f.getKey());
        }
        int a[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            a[i]=ans.get(i);
        }
        return a;
        
    }
}