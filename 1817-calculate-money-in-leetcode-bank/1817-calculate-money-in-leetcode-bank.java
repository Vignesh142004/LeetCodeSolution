class Solution {
    public int totalMoney(int n) {
        int week=n/7;
        int day=n%7;
        int m=1+2+3+4+5+6+7;
        int money=week*m+7*(week-1)*week/2;
        money=money+day*week+day*(day+1)/2;
        return money;
        
    }
}