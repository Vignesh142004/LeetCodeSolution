class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
       /* for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }*///bubble sort
        /*for(int i=1;i<n;i++)
        {
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key)
            {
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }*/ //insertion sort
        for(int i=0;i<n;i++)
        {
            int minidx=i;
            for(int j=i+1;j<n;j++)
            {
                if(nums[minidx]>nums[j])
                {
                    minidx=j;
                }
            }
            int temp=nums[minidx];
            nums[minidx]=nums[i];
            nums[i]=temp;
        }
        for(int i=0;i<n;i++)
        {

        }
        
    }
}