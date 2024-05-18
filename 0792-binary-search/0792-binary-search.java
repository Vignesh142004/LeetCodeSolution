class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int first=0;
        int last=n-1;
        int key=target;
        int result=binarysearch(nums,first,last,key);
        return result;
    }
    int binarysearch(int nums[],int first,int last,int key)
    {
        if(first==last&&nums[first]==key)
        {
            return 0;
        }
    while(first<=last)
    {
         int mid=(first+last)/2;
        if(nums[mid]==key)
        {
            return mid;
        } 
        else if(nums[mid]>key)
        {
            last=mid-1;
        } 
        else
        {
            first=mid+1;
        }    
    }
    return -1;    
    }
}