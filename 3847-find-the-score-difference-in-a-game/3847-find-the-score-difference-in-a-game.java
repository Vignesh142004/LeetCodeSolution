class Solution {
    public int scoreDifference(int[] nums) {

        boolean firstPlayer=true;
        boolean secondPlayer=false;
        int score1=0;
        int score2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2!=0)
            {
                if(firstPlayer)
                {
                    firstPlayer=false;
                    secondPlayer=true;
                }
                else
                {
                    secondPlayer=false;
                    firstPlayer=true;
                }
            }
            if((i+1)%6==0)
            {
                if(firstPlayer)
                {
                    firstPlayer=false;
                    secondPlayer=true;
                }
                else
                {
                    secondPlayer=false;
                    firstPlayer=true;
                }
            }
            if(firstPlayer)
            {
                score1=score1+nums[i];
            }
            else 
            {
                score2=score2+nums[i];
            }
        }
        return score1-score2;
    }
}