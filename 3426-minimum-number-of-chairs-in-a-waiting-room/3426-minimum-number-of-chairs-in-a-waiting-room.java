class Solution {
    public int minimumChairs(String s) {
        int n=s.length();
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='E')
            {
                count++;
            }
            if(s.charAt(i)=='L')
            {
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
        
    }
}