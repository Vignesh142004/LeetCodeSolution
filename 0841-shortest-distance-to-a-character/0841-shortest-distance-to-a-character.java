class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                arr.add(i);
            }
        }
        
        int val[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int ans=Integer.MAX_VALUE;
            for(int j=0;j<arr.size();j++)
            {
                ans=Math.min(Math.abs(i-arr.get(j)),ans);
            }
            val[i]=ans;
        }
        System.out.println(arr);
        return val;

        
    }
}