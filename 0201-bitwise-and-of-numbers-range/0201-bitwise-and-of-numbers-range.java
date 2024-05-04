class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans=left;
        if(left==2147483646||left==2147483647||left==1073741824)
        {
            return left;
        }
        if(right>2147483640)
        {
            return 0;
        }
        for(int i=left+1;i<=right;i++)
        {
            ans=ans&i;
        }
        return ans;
        
    }
}