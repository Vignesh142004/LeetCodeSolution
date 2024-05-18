class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
          int ans=func(i); 
          if(ans==1)
          {
            count++;
          }
        }
        return count;
        
    }
    int func(int n)
    {
        String s=""+n;
        int len=s.length();
        if(len%2==1)
        {
            return 0;
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<len/2;i++)
        {
            sum1=sum1+s.charAt(i);
        }
        for(int i=len/2;i<len;i++)
        {
            sum2=sum2+s.charAt(i);
        }
        
        return sum1==sum2?1:0;
    }
    
}