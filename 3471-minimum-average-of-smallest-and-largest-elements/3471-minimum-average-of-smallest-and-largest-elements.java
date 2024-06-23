class Solution {
    public double minimumAverage(int[] nums) {
        List<Double> ans=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            ans.add((nums[j]+nums[i])/2.0);
            i++;
            j--;
        }
        double min=Integer.MAX_VALUE;
        for(int a=0;a<ans.size();a++)
        {
            min=Math.min(ans.get(a),min);
        }
        System.out.println(ans);
        return min;
        
    }
}