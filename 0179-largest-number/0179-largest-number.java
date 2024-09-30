class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String s1=String.valueOf(nums[i]);
                s1=s1+String.valueOf(nums[j]);
                String s2=String.valueOf(nums[j]);
                s2=s2+String.valueOf(nums[i]);
                if(s1.compareTo(s2)<0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        String fin="";
        for(int i=0;i<n;i++)
        {
            fin=fin+nums[i];
        }
        if(fin.charAt(0)=='0')
        {
            return "0";
        }
        return fin;

        
    }
}