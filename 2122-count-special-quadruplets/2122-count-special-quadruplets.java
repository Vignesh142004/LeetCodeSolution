class Solution {
    public int countQuadruplets(int[] nums) {
        //Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    for (int a = k+1; a < n; a++) {
                        if ( nums[i] + nums[j] + nums[k] == nums[a]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;

    }
}