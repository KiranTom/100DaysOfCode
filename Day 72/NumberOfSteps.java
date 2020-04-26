class Solution {
    public int numberOfSteps (int num) {
        
       int count = 0;

        while (num != 0) {
            count++;
            
            if(num%2 != 0) {
                num = num - 1;
            }
            else {
                num = num >> 1;
            }
        }
        return count;
    }
}
