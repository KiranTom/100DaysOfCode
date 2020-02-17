class Solution {
    public void moveZeroes(int[] nums) {
        
        int i,temp;
		int n = nums.length;
		int last = 0;
		
		for(i=0; i<n; i++) {
			
			if(nums[i]!=0) {
				temp = nums[last];
				nums[last++] = nums[i];
				nums[i] = temp;
			}	
		}
    }
}