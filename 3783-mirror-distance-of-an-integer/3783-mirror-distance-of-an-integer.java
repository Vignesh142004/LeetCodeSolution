class Solution {
    public int mirrorDistance(int n) {

        int rev=0;
        int temp=n;
        while(temp>0)
        {
            int a=temp%10;
            rev=(rev*10)+a;
            temp=temp/10;
        }

        if(rev>n)
        {
            return rev-n;
        }
        return n-rev;
        
    }
}