class Solution {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int count=n/4;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            if(m.getValue()>count)
            {
                return m.getKey();
            }
        }
        return 0;

        
    }
}