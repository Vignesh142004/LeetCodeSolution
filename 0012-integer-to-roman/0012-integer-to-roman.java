class Solution {
    public String intToRoman(int num) {
        String roman[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int values[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int size=roman.length;
        int idx=size-1;
        String ans="";
        while(num>0)
        {
            while(values[idx]<=num)
            {
                ans=ans+roman[idx];
                num=num-values[idx];
            }
            idx--;
        }
        return ans;
        
    }
}