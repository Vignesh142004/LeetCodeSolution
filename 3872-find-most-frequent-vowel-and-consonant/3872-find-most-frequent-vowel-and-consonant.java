class Solution {
    public int maxFreqSum(String s) 
    {
        HashMap<Character,Integer> vowel=new HashMap<>();
        HashMap<Character,Integer> cons=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                if(vowel.containsKey(ch))
                {
                    vowel.put(ch,vowel.get(ch)+1);
                }
                else
                {
                    vowel.put(ch,1);
                }
            }
            else
            {
                if(cons.containsKey(ch))
                {
                    cons.put(ch,cons.get(ch)+1);
                }
                else
                {
                    cons.put(ch,1);
                }
            }
        }
        int vowel_max=0;
        int cons_max=0;
        for(Map.Entry<Character,Integer> m1:vowel.entrySet())
        {
            vowel_max=Math.max(vowel_max,m1.getValue());
        }
        for(Map.Entry<Character,Integer> m2:cons.entrySet())
        {
            cons_max=Math.max(cons_max,m2.getValue());
        }
        return vowel_max+cons_max;
        
    }
}