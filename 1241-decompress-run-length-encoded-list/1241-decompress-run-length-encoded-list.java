class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i = i + 2) {
            sum = sum + nums[i];
        }
        int ans[] = new int[sum];

        int l = 0;
        for (int i = 0; i < n; i = i + 2) {

            int a = nums[i];
            for (int k = 0; k < a; k++) {
                ans[l++] = nums[i + 1];
            }

        }
        return ans;

    }
}