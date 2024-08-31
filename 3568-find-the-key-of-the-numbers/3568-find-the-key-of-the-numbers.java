class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int a[]=new int[4];
        int b[]=new int[4];
        int c[]=new int[4];
        int n1=3;
        while(num1>0)
        {
           int rem=num1%10;
           a[n1--]=rem;
           num1/=10; 
        }
        int n2=3;
        while(num2>0)
        {
            int rem=num2%10;
            b[n2--]=rem;
            num2/=10;
        }
        int n3=3;
        while(num3>0)
        {
            int rem=num3%10;
            c[n3--]=rem;
            num3/=10;
        }
        int a1=Math.min(a[0],Math.min(b[0],c[0]));
        int b1=Math.min(a[1],Math.min(b[1],c[1]));
        int c1=Math.min(a[2],Math.min(b[2],c[2]));
        int d1=Math.min(a[3],Math.min(b[3],c[3]));
        String val=a1+""+b1+""+c1+""+d1+"";
        int ans=Integer.parseInt(val);
        return ans;

        
    }
}