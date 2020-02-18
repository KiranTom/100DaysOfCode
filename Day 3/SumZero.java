// To find N unique integers sum upto zero 
class Solution {
    public int[] sumZero(int n) {
        int result[] = new int[n];
        int sum = 0;
        for(int i = 0 ; i < n-1; i++) {
            result[i] = i;
            sum = sum + i;
        }
        result[n-1] = -sum;
        return result;
    }
}