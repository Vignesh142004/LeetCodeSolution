class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int low=0;
        int high=n-1;
        int ans[]=new int[2];
        while(low<high)
        {
            int sum=numbers[low]+numbers[high];
            if(sum==target)
            {
                ans[0]=low+1;
                ans[1]=high+1;
                break;
            }
            else if(sum>target)
            {
                high--;
            }
            else
            {
                low++;
            }
        }
        return low>=high?null:ans;
        
    }
}