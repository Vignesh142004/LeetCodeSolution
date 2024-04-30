class Solution {
    public boolean checkRecord(String s) {
        int acount=0;
        int pcount=0;
        int lcount=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='P')
            {
                pcount++;
            }
            else if(s.charAt(i)=='A')
            {
                acount++;
            }
        }
        if(s.contains("LLL")|| acount>=2)
        {
            return false;
        }
        return true;
        
    }
}