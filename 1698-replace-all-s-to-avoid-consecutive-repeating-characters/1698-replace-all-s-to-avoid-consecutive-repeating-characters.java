class Solution {
    public String modifyString(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '?') {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (i > 0 && ans.charAt(i - 1)==ch || i < n - 1 && s.charAt(i + 1) == ch) {
                        continue;
                    } else {
                        ans.append(ch);
                        break;
                    }
                }
            } else {
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();

    }
}