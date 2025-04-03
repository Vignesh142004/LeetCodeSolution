class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int ans=0;
        char ch='a';
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=26;i>0;i--)
        {
            hm.put(ch,i);
            ch++;
        }
        for(int i=0;i<n;i++)
        {
            int val=(hm.get(s.charAt(i))*(i+1));
            ans=ans+val;
        }
        return ans;
        
        
    }
}