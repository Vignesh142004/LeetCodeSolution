class Solution {
    public int maxGoodNumber(int[] nums) {
        String s1=Integer.toBinaryString(nums[0]);
        String s2=Integer.toBinaryString(nums[1]);
        String s3=Integer.toBinaryString(nums[2]);
        int a=Integer.parseInt((s1+s2+s3),2);
        int b=Integer.parseInt((s1+s3+s2),2);
        int c=Integer.parseInt((s2+s1+s3),2);
        int d=Integer.parseInt((s2+s3+s1),2);
        int e=Integer.parseInt((s3+s1+s2),2);
        int f=Integer.parseInt((s3+s2+s1),2);
        int a1=Math.max(a,b);
        int a2=Math.max(c,d);
        int a3=Math.max(e,f);
        int ans=Math.max(a1,Math.max(a2,a3));
        return ans;


        
    }
}