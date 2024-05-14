class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans=0;
        for(int i=0;ans<g.length && i<s.length;i++)
        {
            if(g[ans]<=s[i])
            {
                ans++;
            }
        }
        return ans;
        
    }
}