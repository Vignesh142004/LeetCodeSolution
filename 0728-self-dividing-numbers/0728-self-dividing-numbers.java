class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(self(i))
            {
            arr.add(i);
            }
        }
        return arr;  
    }
    private boolean self(int n)
    {  
        int rem;
        for(int t=n;t!=0;t=t/10)
        {
          rem=t%10;
          if(rem==0||n%rem!=0)
          {
            return false;
          }
        }
        return true;
    }
}