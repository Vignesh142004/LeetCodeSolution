class Solution {
    public int prefixCount(String[] words, String pref) {
        int n=words.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
           if(words[i].startsWith(pref))
           {
            ans++;
           }
           continue;
        }
        return ans;
        

    }
}