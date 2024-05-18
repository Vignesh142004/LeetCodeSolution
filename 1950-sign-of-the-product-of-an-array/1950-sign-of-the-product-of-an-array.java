class Solution {
    public int arraySign(int[] nums) {
        double pos=1.0;

        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            pos=pos*nums[i];
        }
        if(pos>0)
        {
            return 1;
        }
        else if(pos<0)
        {
            return -1;
        }
        else{
            return 0;
        }
        
    }
}