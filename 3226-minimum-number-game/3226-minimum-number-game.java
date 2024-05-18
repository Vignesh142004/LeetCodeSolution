class Solution {
    public int[] numberGame(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int a[]=new int[n];
        int j=0;
        int alice;
        int bob;
        for(int i=0;i<n;i++)
        {
            alice=nums[i];
            i++;
            bob=nums[i];
            a[j++]=bob;
            a[j++]=alice;
        }
        return a;
        

        
    }
}