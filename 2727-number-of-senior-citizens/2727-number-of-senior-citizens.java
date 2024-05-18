class Solution {
    public int countSeniors(String[] details) {
        List<String> arr=new ArrayList<>();
        for(String s: details)
        {
            arr.add(s.substring(11,13));
        }
        int count=0;
        for(int i=0;i<arr.size();i++)
        {
            int a=Integer.parseInt(arr.get(i));
            if(a>60)
            {
                count++;
            }
        }
        return count;
        
    }
}