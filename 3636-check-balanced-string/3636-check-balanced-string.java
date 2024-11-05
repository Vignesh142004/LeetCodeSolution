class Solution {
    public boolean isBalanced(String s) {
        int n=s.length();
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even=even+s.charAt(i)-'0';
            }
            else
            {
                odd=odd+s.charAt(i)-'0';
            }
        }
        return even==odd;
        
    }
}