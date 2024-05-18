class Solution {
    public String replaceDigits(String s) {
        char ch[]=s.toCharArray();
        for(int i=1;i<ch.length;i=i+2)
        {
            char c=ch[i-1];
            int a=ch[i]-'0';
            ch[i]=(char)(c+a);
        }
        return new String(ch);
    }
}