class Solution {
    public char findTheDifference(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int n=c1.length;
        
        for(int i=0;i<n;i++)
        {
            if(c1[i]==c2[i])
            {
                continue;
            }
            return c2[i];
        }
        return c2[n];
        
    }
}