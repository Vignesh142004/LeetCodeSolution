class Solution {
    public int countOdds(int low, int high) {
        //int count=0;
        int n=(high-low)+1;
        while(low%2!=0&&high%2!=0)
        {
            return n/2+1;
        }
        return n/2;
        
        
    }
}