class Solution {
    public int countKeyChanges(String s) {
        String s2=s.toLowerCase();
        int count=0;
        for(int i=0;i<s2.length()-1;i++)
        {
            int j=i;
            if(s2.charAt(i)!=s2.charAt(++j))
            {
                count++;
            }
            continue;
        }
        return count;
        
    }
}