class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                char ch=board[i][j];
                if(ch!='.')
                {
                    if(!hs.add(ch+"row"+i)|| !hs.add(ch+"col"+j)||!hs.add(ch+"box"+i/3+j/3))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}