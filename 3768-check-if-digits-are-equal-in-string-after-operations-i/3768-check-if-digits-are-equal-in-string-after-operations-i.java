class Solution {
    static boolean func(String s)
    {
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<n-1;i++)
        {
            int a=Integer.parseInt(s.charAt(i)+"");
            int b=Integer.parseInt(s.charAt(i+1)+"");
            int c=(a+b)%10;
            System.out.println(c);
            s1.append(c);
        }
        if(s1.length()==2 && s1.charAt(0)==s1.charAt(1))
        {
            return true;
        }
        else if(s1.length()==2 && s1.charAt(0)!=s1.charAt(1))
        {
            return false;
        }
        return func(s1.toString());
    }
    public boolean hasSameDigits(String s) {
        boolean ans=func(s);
        return ans;
        
    }
}