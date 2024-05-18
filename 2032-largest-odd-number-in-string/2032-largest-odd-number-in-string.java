class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--)
        {
            int a=(int)num.charAt(i);
            if(a%2==1)
            {
              return num.substring(0,i+1);
            }
           else
           {
            continue;
           }
        }
        return "";

        
    }
}