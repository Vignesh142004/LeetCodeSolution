import java.util.*;
class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        int ans;
        Arrays.sort(nums);
        ans=(nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
        return ans;
        
    }
}