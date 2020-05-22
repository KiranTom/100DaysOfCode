class Solution {
    public boolean isPowerOfThree(int n) {
        
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        boolean rec = isPowerOfThree(n/3);
        if(n%3==0 && rec) {
            return true;
        }
        else {
            return false;
        }
    }
}