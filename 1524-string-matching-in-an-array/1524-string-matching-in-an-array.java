class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j &&words[i].contains(words[j]))
                {
                    arr.add(words[j]);
                }
            }
        }
        HashSet<String> hs=new HashSet<>();
        for(String s:arr)
        {
            hs.add(s);
        } 
        List<String> ans=new ArrayList<>(hs);
        return ans;
 
    }
}