class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int ans[]=new int[n+1];
        int low=0;
        int high=n;
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='I')
            {
                ans[a++]=low;
                low++;
            }
            else if(s.charAt(i)=='D')
            {
                ans[a++]=high;
                high--;
            }
        }
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++)
        {
            sum1=sum1+i;
        }
        for(int i=0;i<ans.length;i++)
        {
            sum2=sum2+ans[i];
        }
        ans[ans.length-1]=sum1-sum2;
        return ans;

        
    }
}