class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int newarr[]=new int[]{-1,-1};
        int end=nums.length-1;
        int mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(nums[mid]==target){
                newarr[0]=mid;
                end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else
            start=mid+1;
        }

int start1=0;
int end1=nums.length-1;
        
        while(start1<=end1){
            mid=(start1+end1)/2;
            if(nums[mid]==target){
                newarr[1]=mid;
                start1=mid+1;
            }
            else if(nums[mid]>target){
                end1=mid-1;
            }
            else
            start1=mid+1;
        }
        return newarr;
    }
}