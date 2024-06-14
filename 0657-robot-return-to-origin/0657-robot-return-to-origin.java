class Solution {
    public boolean judgeCircle(String moves) {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for(int i=0;i<moves.length();i++)
        {
            if(moves.charAt(i)=='U')
            {
                a++;
            }
            else if(moves.charAt(i)=='D')
            {
                b++;
            }
            else if(moves.charAt(i)=='R')
            {
                c++;
            }
            else if(moves.charAt(i)=='L')
            {
                d++;
            }
        }
        if(a==b &&c==d)
        {
            return true;
        }
        return false;
        
    }
}