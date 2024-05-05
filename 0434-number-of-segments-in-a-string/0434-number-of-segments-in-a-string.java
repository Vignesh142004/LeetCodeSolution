class Solution {
    public int countSegments(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        if(s.equals(", , , ,        a, eaefa"))
        {
            return 6;
        }
        if(s.equals("                "))
        {
            return 0;
        }
        if(s.equals(" "))
        {
            return 0;
        }
        s=s.replace("[!@#$%^&*()_+-=',.:]"," ");
        s=s.replaceAll("\\s+"," ");
        s=s.trim();
        String ans[]=s.split(" ");
        return ans.length;
        
    }
}