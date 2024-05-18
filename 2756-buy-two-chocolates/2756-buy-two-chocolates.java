class Solution {
    public int buyChoco(int[] prices, int money) {
       // int n=prices.length;
        Arrays.sort(prices);
        int spent=prices[0]+prices[1];
        return money<spent?money:money-spent;
        
        
    }
}