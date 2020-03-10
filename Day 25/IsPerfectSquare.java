class Solution {
    public boolean isPerfectSquare(int num) {
      
        long start = 1;
        long end = num;
        
        while (start <= end) {
            
           // long mid = start + end >> 1; // this too works
            long mid = end + ((start-end)/2);
            long sqr =  mid * mid; 
            
            if (sqr > num) {
                end = mid-1 ;
            } 
            else if (sqr < num) {
                start = mid+1 ;
            } 
            else {
                return true;
            }
        }
        return false;
    }
}