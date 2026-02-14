class Solution {
    public String largestEven(String s) {

        int len=s.length();
        int idx=-1;
        for(int i=len-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch=='2')
            {
                idx=i;
                break;
            }
        }

        if(idx==-1)
        {
            return "";
        }
        return s.substring(0,idx+1);
        
    }
}