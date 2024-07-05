class Solution {
    public int minCost(String s, int[] time) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            if(s.charAt(i)==s.charAt(i+1))
            {
              sum+=Math.min(time[i],time[i+1]);
              int max=Math.max(time[i],time[i+1]);
              time[i+1]=max; 
            }
        }
        return sum;

        
    }
}