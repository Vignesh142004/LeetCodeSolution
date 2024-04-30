class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int ans[] = new int[n];
        ans[n - 1] = prices[n - 1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[i] >=prices[j]) {
                    ans[i] = prices[i] - prices[j];
                    break;
                }
                ans[i] = prices[i];
            }
        }
        return ans;

    }
}