class Solution {
    public List<Integer> lexicalOrder(int n) 
    {
        List<String> arr=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String s=String.valueOf(i);
            arr.add(s);
        }
        Collections.sort(arr); //lexicographical sorting.
        List<Integer> ans=new ArrayList<>();
        int len=arr.size();
        for(int i=0;i<len;i++)
        {
            int val=Integer.parseInt(arr.get(i));
            ans.add(val);
        }
        return ans;
        
    }
}