class Solution {
    public boolean isBalanced(String s) {
        int n=s.length();
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even=even+Integer.parseInt(s.charAt(i)+"");
            }
            else
            {
                odd=odd+Integer.parseInt(s.charAt(i)+"");
            }
        }
        return even==odd;
        
    }
}