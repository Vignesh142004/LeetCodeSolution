class Solution {
    static void dfs(int i,int j,int image[][],int color,int stcolor)
    {
        int n=image.length;
        int m=image[0].length;
        if(i<0 ||i>=n ||j<0 ||j>=m )
        {
            return;
        }
        if(stcolor!=image[i][j] || image[i][j]==color)
        {
            return;
        }
        image[i][j]=color;
        dfs(i-1,j,image,color,stcolor);
        dfs(i,j-1,image,color,stcolor);
        dfs(i+1,j,image,color,stcolor);
        dfs(i,j+1,image,color,stcolor);

    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int r=image.length;
        int c=image[0].length;
        int stcolor=image[sr][sc];
        dfs(sr,sc,image,color,stcolor);
        return image;
        
         
        
    }
}