class Solution {
    public int minimumSum(int num) {
        int a[]=new int[4];
        int i=0;
        while(num!=0)
        {
            a[i++]=num%10;
            num=num/10;
            
        }
        Arrays.sort(a);
        int ans=10*(a[0]+a[1])+a[2]+a[3];
        return ans;
        
    }
}