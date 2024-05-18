import java.util.*;
class Solution {
    public String defangIPaddr(String address) {
        int n=address.length();
        StringBuilder ans=new StringBuilder();
        for(char ch:address.toCharArray())
        {
            if(ch!='.')
            {
                ans.append(ch);
            }
            else
            {
                ans.append("[.]");
            }
        }
        return ans.toString();
        
    }
}