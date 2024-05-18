class Solution {
    public int averageValue(int[] nums) {
        int n=nums.length;
        List<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0 && nums[i]%3==0)
            {
                arr.add(nums[i]);
                continue;
            }
            
        }
        int sum=0;
        int len=arr.size();
        for(int i=0;i<len;i++)
        {
            sum=sum+arr.get(i);
        }
        int ans=0;
        if(len!=0)
        {
            ans=sum/len;
        }
        return ans;
        
    }
}