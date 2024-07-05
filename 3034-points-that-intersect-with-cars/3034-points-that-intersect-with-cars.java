class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        List<Integer> arr=new ArrayList<>();
        int r=nums.size();
        for(int i=0;i<r;i++)
        {
            int st=nums.get(i).get(0);
            int ed=nums.get(i).get(1);
            for(int j=st;j<=ed;j++)
            {
                arr.add(j);
            }
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int a:arr)
        {
            hs.add(a);
        }
        return hs.size();
        
    }
}