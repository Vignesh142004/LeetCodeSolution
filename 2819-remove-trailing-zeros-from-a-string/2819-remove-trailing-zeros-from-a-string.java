class Solution {
    public String removeTrailingZeros(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--)
        {
            if(num.charAt(i)=='0')
            {
                n--;
            }
            else
            {
                break;
            }
        }
        String ans="";
        for(int i=0;i<n;i++)
        {
            ans=ans+num.charAt(i);
        }
        return ans;

        
    }
}