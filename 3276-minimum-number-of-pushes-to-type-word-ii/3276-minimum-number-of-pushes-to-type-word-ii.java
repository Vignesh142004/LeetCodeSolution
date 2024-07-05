class Solution {
    public int minimumPushes(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else
            {
                hm.put(s.charAt(i),1);
            }
        }
        List<Integer> arr=new ArrayList<>();
        for(Map.Entry<Character,Integer> m:hm.entrySet())
        {
            arr.add(m.getValue());
        }
        Collections.sort(arr);
        int ans=0;
        int val=1;
        for(int i=arr.size()-1;i>=0;i--)
        {
            if(val<=8)
            {
                ans+=arr.get(i)*1;
            }
            else if(val>8 && val<=16)
            {
                ans+=arr.get(i)*2;
            }
            else if(val>16 && val<=24)
            {
                ans+=arr.get(i)*3;
            }
            else if(val>24)
            {
                ans+=arr.get(i)*4;
            }
            val++;
        }
        return ans;


        
    }
}