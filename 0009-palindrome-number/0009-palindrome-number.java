class Solution {
    public boolean isPalindrome(int x) {
        int temp=x,rev=0;
        while(x>0)
        {
            int rem=x%10;
            rev=(rev*10)+rem;
            x=x/10;

        }
        if(temp<0)
        {
            return false;
        }
        else if(temp==rev)
        {
            return true;
        }
        return false;
    }
}