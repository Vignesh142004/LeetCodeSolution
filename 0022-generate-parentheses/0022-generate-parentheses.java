class Solution {
    static void solve(int open ,int close,String s,List<String> ans)
    {
        if(open==0 && close==0)
        {
            ans.add(s);
        }
        if(open>0)
        {
            solve(open-1,close,s+"(",ans);
        }
        if(close>0 && open<close)
        {
            solve(open,close-1,s+")",ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        int open=n;
        int close=n;
        solve(open,close,"",ans);
        return ans;

        
    }
}