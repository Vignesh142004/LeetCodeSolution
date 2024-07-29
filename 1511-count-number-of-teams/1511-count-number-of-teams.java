class Solution {
    public int numTeams(int[] rat) {
        int count=0;
        int n=rat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(((rat[i]<rat[j])&&(rat[j]<rat[k])) ||((rat[i]>rat[j]) &&(rat[j]>rat[k])))
                    {
                        count++;
                    }
                }
            }
        }
        return count;

        
    }
}