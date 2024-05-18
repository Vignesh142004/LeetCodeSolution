class Solution {
    public String convertToBase7(int num) {
        String s=Integer.toString(num,7);
        return s;
       /* String ans="";
        if(num<0)
        {
            
            return "-1";
        }
        if(num==0)
        {
            return "0";
        }
        while(num>0)
        {
            int rem=num%7;
            ans=ans+rem;
            num=num/7;
        }
        return ans;*/
        
    }
}