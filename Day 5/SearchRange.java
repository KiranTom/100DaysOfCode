class Solution {
    public int[] searchRange(int[] nums, int target) {
    
     int i;
     int[] Range = {-1,-1};
     int n = nums.length;
 
     for(i=0; i<n; i++){
        
        if(nums[i] == target){
            Range[0] = i;
            break;
        }
    }
    
        if(Range[0] == -1){
            return Range;
    }
    
        for(int j=n-1; j>=0; j--){
        
        if(nums[j] == target){
            Range[1] = j;
            break;
        }
    }
    return Range;       
    }
}