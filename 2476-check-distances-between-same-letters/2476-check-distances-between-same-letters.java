class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                int a=hm.get(ch);
                hm.put(ch,(i-a)-1);
            }
            else
            {
                hm.put(ch,i);
            }
        }
        for(Map.Entry<Character,Integer> m:hm.entrySet())
        {
            if(m.getValue()!=distance[m.getKey()-'a'])
            {
                return false;
            }
        }
        return true;
        
    }
}