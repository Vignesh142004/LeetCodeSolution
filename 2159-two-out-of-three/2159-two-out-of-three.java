class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        HashSet<Integer> hs3=new HashSet<>();
        for(int a:nums1)
        {
            hs1.add(a);
        }
        for(int b:nums2)
        {
            hs2.add(b);
        }
        for(int c:nums3)
        {
            hs3.add(c);
        }
        List<Integer> arr1=new ArrayList<>(hs1);
        List<Integer> arr2=new ArrayList<>(hs2);
        List<Integer> arr3=new ArrayList<>(hs3);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int d:arr1)
        {
            if(hm.containsKey(d))
            {
                hm.put(d,hm.get(d)+1);
            }
            else
            {
                hm.put(d,1);
            }
        }
        for(int e:arr2)
        {
            if(hm.containsKey(e))
            {
                hm.put(e,hm.get(e)+1);
            }
            else
            {
                hm.put(e,1);
            }
        }
        for(int f:arr3)
        {
            if(hm.containsKey(f))
            {
                hm.put(f,hm.get(f)+1);
            }
            else
            {
                hm.put(f,1);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m: hm.entrySet())
        {
            if(m.getValue()>=2)
            {
                ans.add(m.getKey());
            }
        }
        return ans;
        
    }
}