class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int ans=n/2;
        Set <Integer> arr=new HashSet<>();
        for(int a:candyType)
        {
            arr.add(a);
        }
        if(arr.size()>=ans)
        {
            return ans;
        }
        return arr.size();
        
    }
}