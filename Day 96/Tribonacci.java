class Solution { 
    public int tribonacci(int n) {
        
        if(n == 0) {
            return 0;
        }
        if(n==1 || n==2) {
            return 1;
        }
        else {
            return calculate(n-2, 0, 1, 1);
        }
    }
    
    public int calculate(int n, int t0, int t1, int t2) {

        int result = t2;
        if(n == 0) {
            return result;
        }
        else {
            result = t0+t1+t2;
            return calculate(n - 1 , t1, t2, result);
        }
    }
}
