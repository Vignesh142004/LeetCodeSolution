class Solution {
    public int canBeTypedWords(String s, String b) {
        int n=b.length();
        String str[]=s.split(" ");
        int count=0;
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(str[i].indexOf(b.charAt(j))!=-1)
                {
                    count++;
                    break;
                }
            }
        }
        return str.length-count;

        
    }
}