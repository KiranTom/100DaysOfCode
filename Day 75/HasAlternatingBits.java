class Solution {
    public boolean hasAlternatingBits(int n) {
        
        int num = n & 1;
        while (n != 0) {
            if (num != (n & 1)) {
                return false;
            }
            num = num ^ 1;
            n = n >> 1;
        }
        return true;
    }
}