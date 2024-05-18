class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        char ch[]=s.toCharArray();
        int ans=0;
        int sign=1;
        for(char a : ch)
        {
            int x=a-'0';
            ans=ans+(sign*x);;
            sign=(sign*-1);
        }
        return ans;
        
        
    }
}