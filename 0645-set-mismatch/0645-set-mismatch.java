class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums)
        {
            if(hm.containsKey(a))
            {
                hm.put(a,hm.get(a)+1);
            }
            else
            {
                hm.put(a,1);
            }
        }
        int ans[]=new int[2];
        int rep=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()==2)
            {
                rep=m.getKey();
            }
        }
        int sum1=0;
        for(int i=1;i<=n;i++)
        {
            sum1=sum1+i;
        }
        int sum2=0;
        for(int i=0;i<n;i++)
        {
            sum2=sum2+nums[i];
        }
        int mis=sum1-(sum2-rep);
        ans[0]=rep;
        ans[1]=mis;
        return ans;

        
    }
}