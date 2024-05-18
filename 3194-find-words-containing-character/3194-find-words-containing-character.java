class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans=new ArrayList<>();
        int n=words.length;
        String s2=String.valueOf(x);
        for(int i=0;i<n;i++)
        {
            String s1=words[i];
            if(s1.contains(s2))
            {
                ans.add(i);
            }
        }
        return ans;
        
    }
}