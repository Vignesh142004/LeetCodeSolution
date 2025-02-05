class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int mismatch=0;
        int cnt=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        if(s1.equals(s2))
        {
            return true;
        }
        for(char ch:s1.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        for(char ch:s2.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)-1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> m:hm.entrySet())
        {
            if(m.getValue()!=0)
            {
                cnt++;
            }
        }
        for(int i=0;i<n;i++)
        {
           if(s1.charAt(i)!=s2.charAt(i))
           {
             mismatch++;
           }
        }
        if((mismatch==0 || mismatch==2) && cnt==0)
        {
            return true;
        }
        return false;
        
    }
}