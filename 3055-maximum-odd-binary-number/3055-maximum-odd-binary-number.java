class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                count++;
            }
        }
        String a="";
        for(int i=0;i<count-1;i++)
        {
            a=a+'1';
        }
        for(int i=0;i<n-count;i++)
        {
            a=a+'0';
        }
        a=a+'1';
        return a;
        

        
    }
}