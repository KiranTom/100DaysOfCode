class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        
            List<Integer> list = new ArrayList<>();
        
        if(nums == null) {
            return list;
        }
        
        int n = nums.length;
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        
        Arrays.sort(nums);
        int part = 0;
        for(int i = n - 1; i >= 0; i--) {
            part += nums[i];
            list.add(nums[i]);
            
            if(part > sum - part) {
                return list;
            }
        }
        
        return list;   
    }
}