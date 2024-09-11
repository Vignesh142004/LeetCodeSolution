class Solution {
    static boolean vow(char ch)
    {
        switch(ch)
        {
            case 'a':
            return true;
            case 'e':
            return true;
            case 'i':
            return true;
            case 'o':
            return true;
            case 'u':
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int count=0;
        int max=0;
        for(int i=0;i<k;i++)
        {
            if(vow(s.charAt(i)))
            {
                count++;
                max=Math.max(count,max);
            }
        }
        for(int i=k;i<n;i++)
        {
            if(vow(s.charAt(i)))
            {
                count++;
            }
            if(vow(s.charAt(i-k)))
            {
                count--;
            }
            max=Math.max(max,count);
        }
        return max;
        
    }
}