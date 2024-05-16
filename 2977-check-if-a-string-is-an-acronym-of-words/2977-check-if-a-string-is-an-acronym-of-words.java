class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String a="";
        for(String str:words)
        {
            a=a+str.substring(0,1);
        }
        return a.equals(s);
    
        
    }
}