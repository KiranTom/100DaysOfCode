class Solution {
    public int maxSubArray(int[] nums) {
        
        int i;
		int n = nums.length;
		int m = Integer.MIN_VALUE;
		int sum = 0;
        
		for(i=0; i<n; i++) {
			
			sum = sum +nums[i];
			if(m < sum) {
				m = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return m;
        
    }
}