class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> hm=new HashMap<>(); 
        for(int i=lowLimit;i<=highLimit;i++)
        {
            int n=i;
            int sum=0;
            while(n!=0)
            {
                int rem=n%10;
                sum=sum+rem;
                n=n/10;
            }
            if(hm.containsKey(sum))
            {
                hm.put(sum,hm.get(sum)+1);
            }
            else
            {
                hm.put(sum,1);
            }
            
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            ans=Math.max(ans,m.getValue());


        }
        return ans;
       
        
    }
}