class Solution {
    public int reverse(int x) {
        
        long rev = 0;
        
        while(x != 0) {
            
            rev = rev*10;
            rev = rev + (x % 10);
            x = x / 10;
        }
        if (Math.abs(rev) >= Integer.MAX_VALUE) {
                return 0;
             }
        else {
            int ans = (int)rev;
            return ans;
        }
    }
}