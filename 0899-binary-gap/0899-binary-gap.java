class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int len=s.length();
        int max=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='1')
            {
               for(int j=i+1;j<len;j++)
               {
                  if(s.charAt(j)=='1')
                  {
                    int val=j-i;
                    max=Math.max(max,val);
                    break;
                  }
               }
            }
        }
        return max;
        
    }
}