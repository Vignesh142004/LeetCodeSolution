class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int rem,sum=numBottles;
        while(numBottles>=numExchange)
        {
           rem=numBottles/numExchange;
           sum=sum+rem;
           numBottles=numBottles/numExchange+numBottles%numExchange;

        }
        return sum;

        
    }
}