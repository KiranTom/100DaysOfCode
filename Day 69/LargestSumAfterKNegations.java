class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        
	    Arrays.sort(A);
		int num = 0,totalSum = 0;
        
		for(int i=0;i<K;i++) {
            
			A[num] = -A[num];
			if(num<(A.length-1) && A[num]>A[num+1])
				num++;
		}		
		for(int a:A) {
            
			totalSum += a;
        }
		return totalSum;
    }
}