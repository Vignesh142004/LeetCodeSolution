class Solution {
    boolean ispreandsuff(String s1,String s2)
    {
        if(s2.startsWith(s1) && s2.endsWith(s1))
        {
            return true;
        }
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(ispreandsuff(words[i],words[j]))
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}