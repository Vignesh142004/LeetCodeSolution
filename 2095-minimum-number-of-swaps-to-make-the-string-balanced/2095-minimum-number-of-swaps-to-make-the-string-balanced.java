class Solution {
    public int minSwaps(String s) {
        int count=0;
        int swap=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='[')
            {
                count++;
            }
            else if(s.charAt(i)==']')
            {
                count--;
            }
            if(count==-1)
            {
                swap++;
                count=count+2;
            }
        }
        return swap;
        
    }
}