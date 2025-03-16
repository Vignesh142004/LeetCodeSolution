class Solution {
    public int countPrimeSetBits(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        int count=0;
        for(int i=left;i<=right;i++)
        {
            arr.add(Integer.bitCount(i));
        }
        for(int i=0;i<arr.size();i++)
        {
            boolean flag=false;
            if(arr.get(i)==0 ||arr.get(i)==1)
            {
                 flag=true;
            }
            else{
            for(int j=2;j<=arr.get(i)/2;j++)
            {
                if(arr.get(i)%j==0)
                {
                    flag=true;
                    break;
                }
            }
            }
            if(!flag)
            {
                count++;
            }
        }
        return count;
        
    }
}