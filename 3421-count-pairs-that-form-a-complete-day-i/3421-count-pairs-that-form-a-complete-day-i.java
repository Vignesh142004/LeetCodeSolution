class Solution {
    public int countCompleteDayPairs(int[] hours) {
        int count=0;
        int n=hours.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j && (hours[i]+hours[j])%24==0)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}