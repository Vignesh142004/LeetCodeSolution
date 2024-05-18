class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            String str[]=sentences[i].split(" ");
            ans[i]=str.length;
        }
        Arrays.sort(ans);
        return ans[n-1];
        
        
    }
}