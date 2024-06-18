class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String word:strs)
        {
          char ch[]=word.toCharArray();
          Arrays.sort(ch);
          String sword=new String(ch);
          if(!hm.containsKey(sword))
          {
            hm.put(sword,new ArrayList<>());
          }
          hm.get(sword).add(word);  
        }
        return new ArrayList<>(hm.values()); 
    }
}