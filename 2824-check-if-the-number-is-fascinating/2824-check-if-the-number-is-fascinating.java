class Solution {
    public boolean isFascinating(int n) {
        String s="";
        for(int i=1;i<=3;i++)
        {
            s=s+(n*i);
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
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
        int count=0;
        System.out.println(s);
        for(Map.Entry<Character,Integer>m:hm.entrySet())
        {
            if(m.getValue()==1)
            {
                count++;
            }
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count--;
            }
        }
        if(count==9)
        {
            return true;
        }
        return false;
        
    }
}