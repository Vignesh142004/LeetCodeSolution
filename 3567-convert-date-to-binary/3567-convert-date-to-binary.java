class Solution {
    public String convertDateToBinary(String date) {
        List<String> arr=new ArrayList<>();
        String str[]=date.split("-");
        for(int i=0;i<str.length;i++)
        {
            arr.add(Integer.toBinaryString(Integer.parseInt(str[i])));
        }
        String ans="";
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            ans=ans+arr.get(i);
            ans=ans+"-";
        }
        String fin="";
        int len=ans.length();
        for(int i=0;i<len-1;i++)
        {
            fin=fin+ans.charAt(i);
        }
        return fin;



        
    }
}