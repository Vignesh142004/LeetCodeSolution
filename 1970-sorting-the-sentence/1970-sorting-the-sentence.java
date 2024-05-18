class Solution {
    public String sortSentence(String s) {
        int n=s.length();
        String str[]=s.split(" ");
        int arr[]=new int[str.length];
        String str1[]=new String[str.length];
        for(int i=0;i<str.length;i++)
        {
            arr[i]=Character.getNumericValue(str[i].charAt(str[i].length()-1));
        }
        for(int i=0;i<str.length;i++)
        {
           str1[arr[i]-1]=str[i].substring(0,str[i].length()-1)+" ";
        }
        String a="";
        for(String h:str1)
        {
            a+=h;
        }
        return a.trim();
        
    }
}