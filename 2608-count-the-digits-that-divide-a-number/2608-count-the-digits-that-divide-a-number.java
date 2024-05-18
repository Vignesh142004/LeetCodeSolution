class Solution {
    public int countDigits(int num) {
        int count=0,sum=0;
       int  tem=num;
        while(num>0)
        {
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
            
            if(tem%rem==0)
            {
                count++;
            }

        }
        return count;
        
    }
}