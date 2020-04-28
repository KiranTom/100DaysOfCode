class Solution {
    public int findComplement(int num) {
        
        int n = 1;
        while (num > n) {
            
            n = n << 1;
            n++;
        }
        return num ^n;
    }
}