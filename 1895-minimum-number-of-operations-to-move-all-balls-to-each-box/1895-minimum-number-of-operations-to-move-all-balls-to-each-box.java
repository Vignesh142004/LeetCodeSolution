class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i+1;j<n;j++)
            {
                if(boxes.charAt(j)=='1')
                {
                    sum=sum+(Math.abs(i-j));
                }
            }
            for(int k=0;k<i;k++)
            {
                if(boxes.charAt(k)=='1')
                {
                    sum=sum+(Math.abs(i-k));
                }
            }
            ans[i]=sum;
        }
        return ans;

        
    }
}