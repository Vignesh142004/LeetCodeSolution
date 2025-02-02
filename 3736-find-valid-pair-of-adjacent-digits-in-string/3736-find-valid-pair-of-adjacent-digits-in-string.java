class Solution {
    public String findValidPair(String s) {
        int n=s.length();
        String ans="";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray())
        {
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
            {
                hm.put(ch,1);
            }
        }
        for(int i=0;i<n-1;i++)
        {
            int a=Integer.parseInt(s.charAt(i)+"");
            int b=Integer.parseInt(s.charAt(i+1)+"");
            if((s.charAt(i)!=s.charAt(i+1)) &&(hm.get(s.charAt(i))==a) && (hm.get(s.charAt(i+1))==b))
            {
                ans=ans+s.charAt(i);
                ans=ans+s.charAt(i+1);
                break;
            }
        }
        return ans;
        
    }
}