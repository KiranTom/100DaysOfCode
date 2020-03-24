class Solution {
    public boolean isHappy(int n) {
        
        if (n == 7 || n ==1) {
            return true;
        }
        if (n < 10) {
            return false;
        }
        int total = 0;
        while (n != 0) {
            
            int mod = n%10;
            total += mod*mod;
            n = n/10;
        }
        return isHappy(total); // goes back to the same function
    }
}