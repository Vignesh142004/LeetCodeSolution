class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
        int diff[]=new int[n];
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> hs1=new HashSet<>();
            HashSet<Integer> hs2=new HashSet<>();
            for(int j=i;j>=0;j--)
            {
                hs1.add(nums[j]);    
            }
            for(int k=i+1;k<n;k++)
            {
                hs2.add(nums[k]);
            }
            diff[i]=hs1.size()-hs2.size();
        }
        return diff;
        
    }
}