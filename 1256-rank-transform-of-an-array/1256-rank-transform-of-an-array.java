class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=arr[i];
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        Arrays.sort(num);
        int k=1;
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(num[i]))
            {
                hm.put(num[i],k++);
            }
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=hm.get(arr[i]);
        }
        return ans;
        
    }
}