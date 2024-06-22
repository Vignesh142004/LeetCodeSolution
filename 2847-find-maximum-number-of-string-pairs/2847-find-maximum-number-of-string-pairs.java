class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int n=words.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            StringBuilder s=new StringBuilder(words[i]);
            StringBuilder rev=s.reverse();
            String s1=rev.toString();
            for(int j=i+1;j<n;j++)
            {
                if(s1.equals(words[j]))
                {
                    ans++;
                }
            }

        }
        return ans;
         
        
    }
}