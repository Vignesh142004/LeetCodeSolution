class Solution {
    public int sumBase(int n, int k) {
        String s=Integer.toString(n,k);
        int num1=Integer.valueOf(s);
        int rem,sum=0;
        while(num1!=0)
        {
            rem=num1%10;
            sum=sum+rem;
            num1=num1/10;
        }
        return sum;
        
    }
}