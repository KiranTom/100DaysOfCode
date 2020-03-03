class Solution {
    public int[] sortArrayByParityII(int[] A){
        int n = A.length;
        if(n == 0){
            return new int [0];
        }
        int even =0;
        int odd = 1;
        int x;
        int [] res = new int [n];
        
        for(x = 0; x < n; x++){
            
            if(A[x] % 2 == 0){
                res[even] = A[x];
                even+=2;
            }
            else{
                res[odd]= A[x];
                odd+=2;
            }
        }
        return res;
    }
}