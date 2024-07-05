class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n=mat.length;
        int m=mat[0].length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1)
                {
                    count++;
                }
            }
            hm.put(i,count);
        }
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int a=0;
        int b=0;
        for(Map.Entry<Integer,Integer> p:hm.entrySet())
        {
              arr1[a++]=p.getKey();
              arr2[b++]=p.getValue();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr2[j]>arr2[j+1])
                {
                  int temp1=arr2[j+1];
                  arr2[j+1]=arr2[j];
                  arr2[j]=temp1;
                  int temp2=arr1[j+1];
                  arr1[j+1]=arr1[j];
                  arr1[j]=temp2;
                }
            }
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++)
        {
          ans[i]=arr1[i];
        }
        return ans;

        
    }
}