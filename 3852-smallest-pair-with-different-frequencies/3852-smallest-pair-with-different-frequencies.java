class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        int ans[]={-1,-1};
        Arrays.sort(nums);
        Map<Integer,Integer> hm=new HashMap<>();
        for(int num:nums)
        {
            if(hm.containsKey(num))
            {
                hm.put(num,hm.get(num)+1);
            }
            else
            {
                hm.put(num,1);
            }
        }
        int n=nums.length;
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((nums[i]<nums[j]) && (hm.get(nums[i])!=hm.get(nums[j])))
                {
                    ans[0]=nums[i];
                    ans[1]=nums[j];
                    return ans;
                    
                }
                
            }
        }
        return ans;
        
    }
}