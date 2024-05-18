class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int r,rev=0;
        while(num>0)
        {
           r=num%10;
           rev=(rev*10)+r;
           num=num/10; 
        }
        int sum=0,rem;
        while(rev>0)
        {
            rem=rev%10;
            sum=(sum*10)+rem;
            rev=rev/10;

        }
        if(sum==temp)
        {
            return true;
        }
        else{
            return false;
        }
        
    }
}