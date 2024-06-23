class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='|')
            {
                label:
                for(int j=i+1;j<n;j++)
                {
                    if(s.charAt(j)=='*')
                    {
                        count++;
                    }
                    else if(s.charAt(j)=='|')
                    {
                        i=j;
                        break label;
                    }
                    continue;
                }
            }
        }
        int count1=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='*')
            {
                count1++;
            }
        }
        System.out.println(count);
        System.out.println(count1);
        int ans=count1-count;
        return ans;
        
    }
}