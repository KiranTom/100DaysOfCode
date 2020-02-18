class Solution {
    public int[] sortArrayByParity(int[] A) {
// To arrange even first then odd   
    int i;
    int n = A.length;
    int res [] = new int[n];
    int first = 0;
    int last = n-1;
    for (i=0; i<n; i++ ) {
        if (A[i]%2 == 0) {
            res[first] = A[i];
            first++;
        }
        else {
            res [last] = A[i];
            last--;
        }
    }
    return res;
    }
}