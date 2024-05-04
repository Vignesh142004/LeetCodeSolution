class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder s1=new StringBuilder(s);
        StringBuilder s2=s1.reverse();
        int ans[]=new int[2];
        int odd=0;
        int even=0;
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)=='1')
            {
                if(i%2==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        }
        System.out.println(s2);
        ans[0]=even;
        ans[1]=odd;
        return ans;
        
    }
}