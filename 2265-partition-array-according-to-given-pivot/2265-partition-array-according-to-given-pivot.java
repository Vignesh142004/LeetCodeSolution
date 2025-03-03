class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> less=new ArrayList<>();
        List<Integer> great=new ArrayList<>();
        List<Integer> equal=new ArrayList<>();
        for(int a:nums)
        {
            if(a>pivot)
            {
                great.add(a);
            }
            else if(a<pivot)
            {
                less.add(a);
            }
            else
            {
                equal.add(a);
            }
        }
        less.addAll(equal);
        less.addAll(great);
        //System.out.println(less);
        int ans[]=new int[less.size()];
        for(int i=0;i<less.size();i++)
        {
            ans[i]=less.get(i);
        }
        return ans;
    }
}