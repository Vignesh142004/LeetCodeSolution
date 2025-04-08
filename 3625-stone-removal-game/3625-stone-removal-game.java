class Solution {
    static boolean bob(int n,int req)
    {
        if(n<req)
        {
            return true;
        }
        return alice(n-req,req-1);
    }
    static boolean alice(int n,int req)
    {
        if(n<req)
        {
            return false;
        }
        return bob(n-req,req-1);
    }
    public boolean canAliceWin(int n) {
        if(n<10)
        {
            return false;
        }
        if(n==10)
        {
            return true;
        }
        int req=10;
        return alice(n,req);
        
    }
}