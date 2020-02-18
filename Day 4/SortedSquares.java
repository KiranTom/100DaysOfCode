// To Square and sort an array
//import java.util.Arrays;
class Solution {
    
      public int[] sortedSquares(int[] A) {
        
      /*  int i;
        int n = A.length;
        
        for(i=0; i<n; i++){
            
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A*/
        int n = A.length;
        int[] ans = new int[n];
        int start = 0;
        int end = n - 1;
        int m = n - 1;
        while(start <= end) {
            
            if(A[start] * A[start] > A[end] * A[end]) {
                ans[m--] = A[start] * A[start];
                start++;
            }
            else {
                ans[m--] = A[end] * A[end];
                end--;
            }
        }
        return ans;
    }   
}