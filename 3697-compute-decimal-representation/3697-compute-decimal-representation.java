class Solution {
    public int[] decimalRepresentation(int n) {

        List<Integer> ans=new ArrayList<>();
        int multiple=1;
        while(n>0)
        {
            int rem=n%10;
            int val=rem*multiple;
            multiple*=10;
            if(val!=0)
            {
                ans.add(val);
            }
            n=n/10;

        }
        Collections.sort(ans,(Integer a, Integer b)->b-a);
        int arr[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            arr[i]=ans.get(i);
        }
        return arr;
        
    }
}