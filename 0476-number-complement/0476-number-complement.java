class Solution {
    public int findComplement(int num) {
        String s=Integer.toBinaryString(num);
        String s1=s.replace('0','2').replace('1','0').replace('2','1');
        int ans=Integer.parseInt(s1,2);
        return ans;
        
    }
}