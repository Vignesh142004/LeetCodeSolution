class Solution {
    public List<Integer> intersection(int[][] nums) {
        int r=nums.length;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                if(hm.containsKey(nums[i][j]))
                {
                    hm.put(nums[i][j],hm.get(nums[i][j])+1);
                }
                else
                {
                    hm.put(nums[i][j],1);
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==r)
            {
                ans.add(m.getKey());
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
}