class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int row=k/n;
        int rem=k%n;
        if(row%2==0)
        {
            return rem;
        }
        else
        {
            return (n-rem);
        }
        
    }
}