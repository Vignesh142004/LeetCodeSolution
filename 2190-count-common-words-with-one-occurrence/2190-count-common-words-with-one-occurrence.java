class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> hm1=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        for(String s1:words1)
        {
            if(hm1.containsKey(s1))
            {
              hm1.put(s1,hm1.get(s1)+1);
            }
            else
            {
                hm1.put(s1,1);
            }
        }
        for(String s2:words2)
        {
            if(hm2.containsKey(s2))
            {
                hm2.put(s2,hm2.get(s2)+1);
            }
            else
            {
                hm2.put(s2,1);
            }
        }
        List<String> str1=new ArrayList<>();
        List<String> str2=new ArrayList<>();
        for(Map.Entry<String,Integer> m:hm1.entrySet())
        {
            if(m.getValue()==1)
            {
              str1.add(m.getKey());
            }
        }
        for(Map.Entry<String,Integer> m:hm2.entrySet())
        {
            if(m.getValue()==1)
            {
              str2.add(m.getKey());
            }
        }
        int count=0;
        for(int i=0;i<str1.size();i++)
        {
            for(int j=0;j<str2.size();j++)
            {
                if(str1.get(i).equals(str2.get(j)))
                {
                    count++;
                }
            }
        }
        System.out.print(str1);
        System.out.print(str2);
        return count;
        
    }
}