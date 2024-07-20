class Solution {
    public int minimumLength(String s) {
        int len=s.length();
        int ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<len;i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> m:hm.entrySet())
        {
            if(m.getValue()%2==1)
            {
                ans=ans+1;
            }
            else
            {
                ans=ans+2;
            }
        }
        return ans;
        
    }
}