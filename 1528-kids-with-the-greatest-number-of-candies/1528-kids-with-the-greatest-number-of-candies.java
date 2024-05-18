import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        List<Boolean> output=new ArrayList<>();
        int max=0;//finding maximum in an candy arry
        for(int i:candies)
        {
            max=Math.max(max,i);
        }
        for(int i:candies)
        {
            if(i+extraCandies>=max)
            {
                output.add(true);
            }
            else
            {
                output.add(false);
            }
        }
        return output;
        
        
    }
}