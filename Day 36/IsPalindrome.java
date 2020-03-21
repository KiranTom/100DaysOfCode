class Solution {
    public boolean isPalindrome(int x) {
        int num = Math.abs(x);
        int reverse = 0;
        while(x != 0) {
            
            reverse = reverse * 10;
            reverse = reverse +(x % 10);
            x = x/10;
        }
        if(reverse == num) {
            return true;
        }
        else{
            return false;
        }
    }
}