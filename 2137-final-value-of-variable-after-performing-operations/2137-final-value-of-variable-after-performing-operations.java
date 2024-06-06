class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        int n=operations.length;
        for(String c:operations)
        {
            count+=(c.charAt(1)=='+'?1:-1);
        }
        return count;
        
    }
}