class Solution {
    static int func1(int a,int b,int arr[])
    {
      int ans=1;
      for(int i=a;i<b;i++)
      {
         if(arr[i]>arr[i+1])
         {
            ans++;
         }
         else
         {
            break;
         }
      }
      return ans;
    }
    static int func2(int a,int b,int arr[])
    {
       int ans=1;
       for(int i=a;i<b;i++)
       {
        if(arr[i]<arr[i+1])
        {
            ans++;
        }
        else
        {
            break;
        }
       }
       return ans;
    }
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int des=func1(i,j,nums);
                int inc=func2(i,j,nums);
                int val=Math.max(des,inc);
                ans=Math.max(val,ans);
            }
        }
        return ans;
        
    }
}