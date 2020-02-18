class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        int s = 1;
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        
    for (i = 0; i < n; i++) {
        
        if (i < n - 1) {
            if (nums[i] != nums[i + 1]) {
            nums[s] = nums[i + 1]a;
            s++;
            }
        }
    }
    return s;
    }
}