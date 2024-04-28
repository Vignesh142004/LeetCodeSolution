class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> romanmap=new HashMap();
        romanmap.put('I',1);
        romanmap.put('V',5);
        romanmap.put('X',10);
        romanmap.put('L',50);
        romanmap.put('C',100);
        romanmap.put('D',500);
        romanmap.put('M',1000);
        int n=s.length();
        int num=romanmap.get(s.charAt(n-1));
        for(int i=n-2;i>=0;i--)
        {
            if(romanmap.get(s.charAt(i))>=romanmap.get(s.charAt(i+1)))
            {
                num=num+romanmap.get(s.charAt(i));
            }
            else
            {
                 num=num-romanmap.get(s.charAt(i));
            }
        }
        return num;

    
        
    }
}