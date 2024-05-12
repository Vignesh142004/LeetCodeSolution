class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr=new ArrayList<>();
        for(int i=num.length-1;i>=0;i--)
        {
            arr.add(0,(num[i]+k)%10);
            k=(num[i]+k)/10;
        }
        while(k>0)
        {
            arr.add(0,k%10);
            k=k/10;
        }
        return arr;
        
    }
}