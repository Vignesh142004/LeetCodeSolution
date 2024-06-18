class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)
        {
            return false;
        }
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<n;i++)
        {
            if(c1[i]!=c2[i])
            {
                return false;
            }
        }
        return true;
        
    }
}