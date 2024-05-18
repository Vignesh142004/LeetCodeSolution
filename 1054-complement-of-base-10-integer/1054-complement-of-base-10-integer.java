class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String s1=s.replace('0','2').replace('1','0').replace('2','1');
        int ans=Integer.parseInt(s1,2);
        return ans;
        

    }
}