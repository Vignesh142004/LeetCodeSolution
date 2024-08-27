class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++)
        {
            int a=arr1.get(arr1.size()-1);
            int b=arr2.get(arr2.size()-1);
            if(a>b)
            {
                arr1.add(nums[i]);
            }
            else
            {
                arr2.add(nums[i]);
            }
        }
        arr1.addAll(arr2);
        int len=arr1.size();
        int ans[]=new int[len];
        for(int i=0;i<len;i++)
        {
            ans[i]=arr1.get(i);
        }
        return ans;
        
    }
}