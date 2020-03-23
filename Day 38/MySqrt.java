class Solution {
    public int mySqrt(int x) {

        long ans = x;
        long temp = ans*ans;
        //Newton's method
        while (temp > x) {
            
            ans = (ans + x / ans) / 2;
            temp = ans*ans;
        }
        int result = (int)ans;
        return result;
    }
}