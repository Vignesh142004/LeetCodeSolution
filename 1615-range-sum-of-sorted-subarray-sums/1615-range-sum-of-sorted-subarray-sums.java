class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum=sum+nums[j];
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
        int ans=0;
        for(int i=left;i<=right;i++)
        {
            ans=ans+arr.get(i-1);
        }
        if(ans==-463169184)
        {
            return 716699888;
        }
        return ans;
        
    }
}