class Solution {
    public boolean canAliceWin(int[] nums) {
        int alice=0;
        int bob=0;
        int alice1=0;
        int bob1=0;
        for(int a:nums)
        {
            if(a>=1 && a<=9)
            {
                alice+=a;
            }
            else
            {
                bob+=a;
            }
        }
        for(int a:nums)
        {
            if(a>=1 && a<=9)
            {
                bob1+=a;
            }
            else
            {
                alice1+=a;
            }
        }
        boolean one=alice>bob;
        boolean two=alice1>bob1;
        return one||two;
        
    }
}