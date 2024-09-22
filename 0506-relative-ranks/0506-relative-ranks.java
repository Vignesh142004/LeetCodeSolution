class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:score)
        {
            pq.add(a);
        }
        int rank=1;
        String ans[]=new String[n];

        while(pq.size()!=0)
        {
           int val=pq.poll();
           for(int i=0;i<n;i++)
           {
             if(score[i]==val)
             {
                 if(rank==1)
                 {
                    ans[i]="Gold Medal";
                    break;
                 }
                 else if(rank==2)
                 {
                    ans[i]="Silver Medal";
                    break;
                 }
                 else if(rank==3)
                 {
                    ans[i]="Bronze Medal";
                    break;
                 }
                 else
                 {
                    String s=String.valueOf(rank);
                    ans[i]=s;
                    break;
                 }
             }
           }
           rank++;
        }
        return ans;
        
    }
}