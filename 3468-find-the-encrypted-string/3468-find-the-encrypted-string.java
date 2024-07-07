class Solution {
    public String getEncryptedString(String s, int k) {
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            int j=(i+k)%n;
            s1.append(s.charAt(j));
        }
        return s1.toString();
        
    }
}