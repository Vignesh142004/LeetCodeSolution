class Solution {
    public boolean squareIsWhite(String s) {
        switch(s.charAt(0))
        {
            case 'a':
            int n= Integer.valueOf( s.charAt(1));
            if(n%2==0)
            {
                return true;
            }
            return false;
            case 'b':
            int q= Integer.valueOf( s.charAt(1));
            if(q%2==1)
            {
                return true;
            }
            return false;
            case 'c':
            int w= Integer.valueOf( s.charAt(1));
            if(w%2==0)
            {
                return true;
            }
            return false;
            

            case 'd':
            int e= Integer.valueOf( s.charAt(1));
            if(e%2==1)
            {
                return true;
            }
            return false;
            case 'e':
            int r= Integer.valueOf( s.charAt(1));
            if(r%2==0)
            {
                return true;
            }
            return false;
            case 'f':
            int t= Integer.valueOf( s.charAt(1));
            if(t%2==1)
            {
                return true;
            }
            return false;
            case 'g':
            int y= Integer.valueOf( s.charAt(1));
            if(y%2==0)
            {
                return true;
            }
            return false;
            case 'h':
            int u= Integer.valueOf( s.charAt(1));
            if(u%2==1)
            {
                return true;
            }
            return false;

            
        }
        return false;
        
    }
}