class Solution {
    public int[] plusOne(int[] digits) {
        
        int i,sum;
        int carry = 1;
        int n = digits.length;
        for(i=n-1; i>=0; i--){
            sum = digits[i] + carry;
            if(sum >= 10){
                carry = 1;
            }
            else{
                carry = 0;
            }
            digits[i] = sum%10;
        }
        if(carry == 1){
            int[] result = new int [n+1];
            System.arraycopy(digits, 0, result, 1, n);
            result[0] = 1;
            return result;
        }
        else{
            return digits;
        }
    }
}