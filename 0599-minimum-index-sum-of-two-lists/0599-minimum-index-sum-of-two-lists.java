class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> arr=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++)
        {
            for(int j=0;j<list2.length;j++)
            {
                if(list1[i].equals(list2[j]))
                {
                    if((i+j)<min)
                    {
                       min=(i+j);
                       arr.clear();
                       arr.add(list1[i]);
                    }
                    else if((i+j)==min)
                    {
                        min=(i+j);
                        arr.add(list1[i]);
                    }

                }
            }
        }
        
        String ans[]=new String[arr.size()];
        int a=0;
        for(String s:arr)
        {
           ans[a++]=s;
        }
        return ans;
        
    }
}