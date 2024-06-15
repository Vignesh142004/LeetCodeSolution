class Solution {
    public int distinctAverages(int[] nums) {
        int n=nums.length;
        List<Double> arr=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n/2;i++)
        {
            double ans=(nums[i]+nums[n-i-1])/2.0;
            arr.add(ans);
        }
        System.out.println(arr);
        HashMap<Double,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
            if(hm.containsKey(arr.get(i)))
            {
                hm.put(arr.get(i),hm.get(arr.get(i))+1);
            }
            else
            {
                hm.put(arr.get(i),1);
            }
        }
        int count=0;
        for(Map.Entry<Double,Integer> m:hm.entrySet())
        {
            count++;
        }
        return count;


        
    }
}