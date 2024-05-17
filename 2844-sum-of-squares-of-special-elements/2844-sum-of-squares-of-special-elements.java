class Solution {
    public int sumOfSquares(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                arr.add(nums[i-1]);
            }
            else
            {
                continue;
            }
        }
        int sum=0;
        for(int i=0;i<arr.size();i++)
        {
            sum=sum+(arr.get(i)*arr.get(i));
        }
        return sum;
        
    }
}