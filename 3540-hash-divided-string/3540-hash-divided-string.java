class Solution {
    public String stringHash(String s, int k) {
        List<String> arr=new ArrayList<>();
        int n=s.length();
        String s1="";
        int count=0;
        for(int i=0;i<n;i++)
        {
            s1=s1+s.charAt(i);
            count++;
            if(count%k==0)
            {
                arr.add(s1);
                count=0;
                s1="";
            }  
        }
        String ans="";
        int len=arr.size();
        for(String st:arr)
        {
            int sum=0;
            int n1=st.length();
            for(int j=0;j<n1;j++)
            {
                int val=((int)st.charAt(j))-97;
                sum=sum+val;
            }
            ans=ans+(char)((sum%26)+97);
        }
        return ans;
        
    }
}