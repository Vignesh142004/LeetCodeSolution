class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        int first=nums[0];
        Arrays.sort(nums);
        List<Integer> arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<n;i++)
        {
              if(nums[i]!=nums[i-1])
              {
                arr.add(nums[i]);
              }

        }
       if(arr.size()<3)
       {
        return arr.get(arr.size()-1);
       }
       else
       {
        return arr.get(arr.size()-3);
       }
        /*for(int i=1;i<n;i++)
        {
            if(nums[i]>first)
            {
                first=nums[i];
            }
        }
        int second=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>second && nums[i]<first)
            {
                second=nums[i];
            }
        }
        int thrid=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>thrid && nums[i]<second)
            {
                thrid=nums[i];
            }
        }
        return thrid;*/
        

    }
}