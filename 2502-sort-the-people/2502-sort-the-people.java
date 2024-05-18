class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        Arrays.sort(arr, (i, j) -> heights[j] - heights[i]);
        String[] ans = new String[n];
        for (int i = 0; i < n; ++i) {
            ans[i] = names[arr[i]];
        }
        return ans;
    }
}