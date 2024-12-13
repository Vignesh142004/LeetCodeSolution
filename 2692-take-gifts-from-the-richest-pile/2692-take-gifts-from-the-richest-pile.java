class Solution {
    public long pickGifts(int[] gift, int k) {
        int n=gift.length;
        while(k!=0)
        {
            int idx=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(gift[i]>max)
                {
                    max=gift[i];
                    idx=i;
                }
            }
            double val=Math.floor(Math.sqrt(max));
            int a=(int)val;
            gift[idx]=a;
            k--; 
        }
        long ans=0;
        for(int a:gift)
        {
            ans=ans+a;
        }
        return ans;
        
    }
}