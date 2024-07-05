class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                return s.charAt(i);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        return '0';
        
    }
}