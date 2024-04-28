class Solution {
    public int minOperations(int k) {
        int a=4*k;
        double ans=Math.ceil(Math.sqrt(a));
        return (int)ans-2;
        
    }
}