class Solution {

    public int maxOperations(int[] nums) {

        int n = nums.length;

        int count = 1;

        int sum = nums[0] + nums[1];

        for (int i = 2; i < n - 1; i++)

        {

            int j = i;

            if (nums[i] + nums[j + 1] == sum)

            {

                count++;
                i++;

            } else {
                break;
            }

        }

        return count;

    }

}
