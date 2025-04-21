class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long ans=0;
        int n=values.length;
        for(int i=0;i<n;)
        {
            if(i>=n || i<0 ||instructions[i].equals("visited"))
            {
                break;
            }
            else if(instructions[i].equals("add"))
            {
                ans=ans+values[i];
                instructions[i]="visited";
                i++;
            }
            else if(instructions[i].equals("jump"))
            {
                instructions[i]="visited";
                i=i+values[i];
            }
        }
        return ans;
        
    }
}