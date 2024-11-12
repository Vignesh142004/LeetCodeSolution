class Solution {
    public boolean findSubarrays(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n-1;i++)
        {
            int sum=nums[i]+nums[i+1];
            if(hs.contains(sum))
            {
                return true;
            }
            else
            {
                hs.add(sum);
            }
        }
        return false;
        
    }
}