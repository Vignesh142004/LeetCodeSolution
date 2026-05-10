class Solution {
    public int[] scoreValidator(String[] events) {

        int n=events.length;
        int totalScore=0;
        int counter=0;
        int ans[]=new int[2];

        for(String s:events)
        {
            if(counter==10)
            {
                break;
            }
            if(s.equals("W"))
            {
                counter+=1;
            }
            else if(s.equals("WD") || s.equals("NB"))
            {
                totalScore+=1;
            }
            else
            {
                int val=Integer.parseInt(s);
                totalScore+=val;
            }
        }
        ans[0]=totalScore;
        ans[1]=counter;
        return ans;
        
    }
}