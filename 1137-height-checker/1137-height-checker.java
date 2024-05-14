class Solution {
    public int heightChecker(int[] heights) {
        int ans[]=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            ans[i]=heights[i];
        }
        Arrays.sort(ans);
        int count=0;
        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]!=heights[i])
            {
                count++;
            }
        }
        return count;
        
    }
}