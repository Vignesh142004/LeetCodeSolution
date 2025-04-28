class Solution {
    public String[] findWords(String[] words) {
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        List<String> arr=new ArrayList<>();
        for(String s:words)
        {
            String temp=s;
            int n=s.length();
            int r1=0;
            int r2=0;
            int r3=0;
            s=s.toLowerCase();
            for(int i=0;i<n;i++)
            {
                char ch=s.charAt(i);
                if(row1.indexOf(ch)!=-1)
                {
                    r1++;
                }
                else if(row2.indexOf(ch)!=-1)
                {
                    r2++;
                }
                else if(row3.indexOf(ch)!=-1)
                {
                    r3++;
                }
            }
            if(r1==n || r2==n ||r3==n)
            {
                arr.add(temp);
            }
        }
        String ans[]=new String[arr.size()];
        int len=arr.size();
        for(int i=0;i<len;i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}