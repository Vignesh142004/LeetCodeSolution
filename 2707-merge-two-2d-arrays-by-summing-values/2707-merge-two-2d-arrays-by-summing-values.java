class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int r1=nums1.length;
        int r2=nums2.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<r1;i++)
        {
            if(hm.containsKey(nums1[i][0]))
            {
                hm.put(nums1[i][0],hm.get(nums1[i][0])+nums1[i][1]);
            }
            else
            {
                hm.put(nums1[i][0],nums1[i][1]);
            }
        }
        for(int i=0;i<r2;i++)
        {
            if(hm.containsKey(nums2[i][0]))
            {
                 hm.put(nums2[i][0],hm.get(nums2[i][0])+nums2[i][1]);
            }
            else
            {
                hm.put(nums2[i][0],nums2[i][1]);
            }
        }
        int ans[][]=new int[hm.size()][2];
        int a=0;
        
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
             ans[a][0]=m.getKey();
             ans[a][1]=m.getValue();
             a++;
        }
        System.out.println(hm.size());
        Arrays.sort(ans, (c,d)->c[0]-d[0]);
        return ans;
        
    }
}