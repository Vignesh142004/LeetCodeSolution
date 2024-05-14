class Solution {
    public boolean checkPowersOfThree(int n) {
        if(n==1)
        {
            return true;
        }
        else if(n%3==2)
        {
            return false;
        }
        return checkPowersOfThree(n/3);
        

        
    }
}