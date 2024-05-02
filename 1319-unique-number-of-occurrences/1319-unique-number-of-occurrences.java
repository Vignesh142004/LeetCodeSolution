class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        int len=arr.length;
        for(int i=0;i<len;i++)
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
        List<Integer> a= new ArrayList<>();
        for(Map.Entry<Integer,Integer> m:hm.entrySet())
        {
            a.add(m.getValue());
        }
        HashMap<Integer,Integer> hm1=new HashMap<>();
        for(int i=0;i<a.size();i++)
        {
            if(hm1.containsKey(a.get(i)))
            {
                hm1.put(a.get(i),hm1.get(a.get(i))+1);
            }
            else
            {
                hm1.put(a.get(i),1);
            } 
        }
        for(Map.Entry<Integer,Integer> m1:hm1.entrySet())
        {
            if(m1.getValue()>1)
            {
                return false;
            }
        }
        return true;

        
    }
}