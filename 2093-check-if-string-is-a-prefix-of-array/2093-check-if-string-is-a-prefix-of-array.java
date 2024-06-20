class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int n = words.length;
        String a ="";
        for (int i = 0; i<words.length; i++) {
            a = a+words[i];
            if (s.equals(a)) {
                return true;
            }
        }
            
        
        return false;

    }
}