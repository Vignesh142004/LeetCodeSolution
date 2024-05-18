class Solution {
    public int subtractProductAndSum(int n) {
        int rem,sum=0,mul=1;
        int temp=n;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        
        while(temp>0)
        {
            rem=temp%10;
            mul=mul*rem;
            temp=temp/10;
        }
        return mul-sum;
        
    }
}