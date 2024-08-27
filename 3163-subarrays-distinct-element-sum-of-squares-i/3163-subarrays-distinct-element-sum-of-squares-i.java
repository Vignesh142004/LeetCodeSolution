class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                hs.add(nums.get(j));
                int s=hs.size();
                sum=sum+(s*s);
            }
            
        }
        return sum;
        
    }
}