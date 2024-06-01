class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int sum=0;
         int diff=s.charAt(0);
        for(int i=1;i<n;i++)
        {
           int as=s.charAt(i);
           diff=Math.abs(diff-as);
           sum=sum+diff;
           diff=as;
        }
        return sum;

        
    }
}