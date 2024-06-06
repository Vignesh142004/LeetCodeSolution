class Solution {
    public int hammingDistance(int x, int y) {
        String s1=Integer.toBinaryString(x);
        String s2=Integer.toBinaryString(y);
        String a= String.format("%32s",s1).replace(' ', '0');
        String b= String.format("%32s",s2).replace(' ', '0');
        System.out.println(a);
        System.out.println(b);
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                count++;
            }
        }
        return count;

        
    }
}