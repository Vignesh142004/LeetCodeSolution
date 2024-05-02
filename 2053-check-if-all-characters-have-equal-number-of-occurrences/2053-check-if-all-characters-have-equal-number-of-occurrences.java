class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int a=s.charAt(0);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==a)
            {
                count++;
            }
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
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
            if(m.getValue()!=count)
            {
                return false;
            }
            continue;
        }
        return true;

        
    }
}