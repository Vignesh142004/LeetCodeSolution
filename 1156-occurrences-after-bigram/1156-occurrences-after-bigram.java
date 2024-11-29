class Solution {
    public String[] findOcurrences(String text, String f, String s) {
        String str[]=text.split(" ");
        int n=str.length;
        List<String> arr=new ArrayList<>();
        for(int i=0;i<n-2;i++)
        {
            if(str[i].equals(f) && str[i+1].equals(s))
            {
                arr.add(str[i+2]);
            }
        }
        int len=arr.size();
        String ans[]=new String[len];
        for(int i=0;i<len;i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
        
    }
}