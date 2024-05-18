class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int a:nums)
        {
            String s=Integer.toString(a);
            for(int i=0;i<s.length();i++)
            {
                int p=s.charAt(i)-'0';
                arr.add(p);

            }
        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
}