class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n=salary.length;
        double sum=0;
        for(int i=1;i<n-1;i++)
        {
            sum=sum+salary[i];
        }
        double ans=sum/(n-2);
        return ans;
        
    }
}