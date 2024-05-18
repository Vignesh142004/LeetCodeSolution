class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(List<String> a:items)
        {
            String type=a.get(0);
            String color=a.get(1);
            String name=a.get(2);
            if("type".equals(ruleKey)&&type.equals(ruleValue))
            {
                count++;
            }
            if("color".equals(ruleKey)&&color.equals(ruleValue))
            {
                count++;
            }
            if("name".equals(ruleKey)&&name.equals(ruleValue))
            {
                count++;
            }
           

        }
         return count;

        
    }
}