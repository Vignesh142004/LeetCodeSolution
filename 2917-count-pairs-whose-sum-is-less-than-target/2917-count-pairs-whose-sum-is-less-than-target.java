class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int count=0;
        Collections.sort(nums);
        int low=0;
        int high=n-1;
        while(low<high)
        {
            if(nums.get(low)+nums.get(high)<target)
            {
                count=count+(high-low);
                low=low+1;
            }
            else
            {
                high=high-1;
            }
        }
        return count;
        
    }
}