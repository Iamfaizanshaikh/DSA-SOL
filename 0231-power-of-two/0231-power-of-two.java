class Solution {
    public boolean isPowerOfTwo(int n) {
        long num=n;
        if(n==0) return false;
        if((num & (num-1))==0) return true;

        return false;
        
    }
}