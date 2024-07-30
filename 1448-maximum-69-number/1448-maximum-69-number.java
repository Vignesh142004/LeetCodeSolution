class Solution {
    public int maximum69Number (int num) {
        String s=Integer.toString(num);
        int idx=s.indexOf('6');
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            if(i==idx)
            {
                ans=(ans*10)+9;
                continue;
            }
            ans=(ans*10)+s.charAt(i)-'0';
        }
        return ans;
        
        
    }
}