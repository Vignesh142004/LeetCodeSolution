class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        int a=0;
        int b=odd.size()-1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
            {
                ans[i]=odd.get(b--);
            }
            else
            {
                ans[i]=even.get(a++);
            }
        }
        return ans;
        
    }
}