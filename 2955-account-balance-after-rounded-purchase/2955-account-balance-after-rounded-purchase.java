class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        double round=Math.floor((purchaseAmount+5)/10)*10;
        int ans=100-(int)round;
        return ans;
        
    }
}