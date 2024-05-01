class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
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
        List<Character> arr=new ArrayList<>();
        for(Map.Entry<Character,Integer> m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
                arr.add(m.getKey());
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            ans.add(s.indexOf(arr.get(i)));
        }
        int min=Integer.MAX_VALUE;
        if(arr.size()==0)
        {
            return -1;
        }
        for(int i=0;i<ans.size();i++)
        {
            min=Math.min(min,ans.get(i));
        }
        return min;
       
        
    }
}