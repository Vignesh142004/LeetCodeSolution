class Solution {
    static String vowel(String s,int n)
    {
       String last="";
       for(int i=0;i<n;i++)
       {
         last=last+'a';
       }
       StringBuilder ans=new StringBuilder(" ");
       ans.append(s);
       ans.append("ma");
       ans.append(last);
       return ans.toString();
    }
    static String cons(String s,int n)
    {
        int len=s.length();
        String last="";
        for(int i=0;i<n;i++)
        {
            last=last+'a';
        }
        StringBuilder ans=new StringBuilder(" ");
        ans.append(s.substring(1));
        ans.append(s.charAt(0));
        ans.append("ma");
        ans.append(last);
        return ans.toString();
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
            fin=fin+str[i];
        }
        return fin.trim();

        
    }
}