class Solution {
    static boolean isMonoBit(String s)
    {
        int len=s.length();
        int zeroCount=0;
        int oneCount=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='0')
            {
                zeroCount++;
            }
            else
            {
                oneCount++;
            }
        }
        if(zeroCount==len || oneCount==len)
        {
            return true;
        }
        return false;
    }
    public int countMonobit(int n) {
        int count=0;
        for(int i=0;i<=n;i++)
        {
            String binary=Integer.toBinaryString(i);
            if(isMonoBit(binary))
            {
                count++;
            }
        }
        return count;

    }
}