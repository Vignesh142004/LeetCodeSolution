class Solution {
    static int vowelCount(String s)
    {
        int count=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
        }
        return count;
    }
    static String reverse(String s)
    {
        String ans="";
        for(char ch:s.toCharArray())
        {
            ans=ch+ans;
        }
        return ans;
    }
    public String reverseWords(String s) {

        String str[]=s.split(" ");
        String ans=str[0]+" ";
        int vcount=vowelCount(str[0]);
        for(int i=1;i<str.length;i++)
        {
             if(vcount==vowelCount(str[i]))
             {
                 ans=ans+reverse(str[i])+" ";
             }
             else
             {
                ans=ans+str[i]+" ";
             }
        }
        return ans.trim();
        
    }
}