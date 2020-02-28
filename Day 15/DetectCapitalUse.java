class Solution {
    public boolean detectCapitalUse(String word) {
        
        boolean caps = false, small = false;
        int nc = 0;
        char[] arr = word.toCharArray();
        
        for(char c : arr) {
            
            if(c >= 'a' && c <= 'z') {
                if(nc > 1){ 
                    return false;
                }
                small = true;
            }
            else {
                if(small){ 
                    return false;
                }
                nc++;
            }
        }
        return true;
    }
}