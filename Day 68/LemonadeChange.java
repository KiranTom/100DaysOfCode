class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int n = bills.length;
        if(n==0) {
            return true;
        }
        int fives = 0, tens = 0;
        
        for(int i=0;i<n;i++){
            
            int amount = bills[i];
            if(amount == 5) {
                fives++;
                if(fives<0) {
                    return false;
                }
            } 
            else if(amount == 10) {
                fives--;
                tens++;
                if(fives<0) {
                    return false;
                }
            } 
            else {
                if(tens>0) {
                    tens--;
                    fives--;
                } 
                else {
                    fives -= 3;
                }
                if(fives<0 || tens<0) {
                    return false;
                }
            }
        }
        return true;
    }
}