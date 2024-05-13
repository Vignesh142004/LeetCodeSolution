class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        for(String a:str1)
        {
            if(hm.containsKey(a))
            {
                hm.put(a,hm.get(a)+1);
            }
            else
            {
                hm.put(a,1);
            }
        }
         for(String b:str2)
        {
            if(hm.containsKey(b))
            {
                hm.put(b,hm.get(b)+1);
            }
            else
            {
                hm.put(b,1);
            }
        }
        List<String> arr=new ArrayList<>();
        for(Map.Entry<String,Integer> m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
                arr.add(m.getKey());
            }
        }
        String ans[]=new String[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
}