class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        int arr[]=new int[26];
        if(n<k)
        {
            return false;
        }
        for(char ch:s.toCharArray())
        {
            arr[ch-'a']++;
        }
        int count=0;
        for(int a:arr)
        {
            if(a%2!=0)
            {
                count++;
            }
        }
        if(count>k)
        {
            return false;
        }
        return true;

        
    }
}