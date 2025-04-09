class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int min=Integer.MAX_VALUE;
        for(int a:nums)
        {
            if(a<k)
            {
                return -1;
            }
            
    
                min=Math.min(min,a);
                hs.add(a);
            
        }
        return hs.size()-(min==k?1:0);
        
    }
}