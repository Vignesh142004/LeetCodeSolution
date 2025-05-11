class Solution {
    public int minDeletion(String s, int k) 
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        int unique=0;
        for(char ch:s.toCharArray())
        {
            if(hm.containsKey(ch))
            {
               hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
                unique++;
            }
        }
        List<Integer> counts=new ArrayList<>(hm.values());
        Collections.sort(counts);
        int d=unique-k;
        if(d<=0)
        {
            return 0;
        }
        int ans=0;
        for(int i=0;i<d;i++)
        {
            ans=ans+counts.get(i);
        }
        return ans;

    }
}