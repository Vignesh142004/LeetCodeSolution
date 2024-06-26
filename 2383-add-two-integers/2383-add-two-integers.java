class Solution {
    public int sum(int num1, int num2) {
         int ans=0;
         int carry=0;
         while(num2!=0)
         {
            ans=num1^num2;
            carry=num1&num2;
            carry=carry<<1;
            num1=ans;
            num2=carry;
         }
         return num1;
        
    }
}