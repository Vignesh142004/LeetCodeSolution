class Solution {
    static String vowel(String s,int n)
    {
       String last="";
       for(int i=0;i<n;i++)
       {
         last=last+'a';
       }
       String ans="";
       ans=s+"ma";
       ans=ans+last;
       return ans;
    }
    static String cons(String s,int n)
    {
        int len=s.length();
        String last="";
        for(int i=0;i<n;i++)
        {
            last=last+'a';
        }
        String ans=s.substring(1,len);
        ans=ans+s.charAt(0);
        ans=ans+"ma";
        ans=ans+last;
        return ans;
    }
    public String toGoatLatin(String se) {
        String str[]=se.split(" ");
        int n=str.length;
        for(int i=0;i<n;i++)
        {
           char ch=str[i].charAt(0);
           if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
               str[i]=vowel(str[i],i+1);
           }
           else
           {
              str[i]=cons(str[i],i+1);
           }
        }
        String fin="";
        for(int i=0;i<str.length;i++)
        {
            fin=fin+str[i]+" ";
        }
        return fin.trim();

        
    }
}