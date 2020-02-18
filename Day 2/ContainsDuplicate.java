class Solution {
    
    public boolean containsDuplicate(int[] nums) {
        
	Set<Integer> s = new HashSet<>();
        
	for(int n : nums)
        if(!s.add(n)) return true;
        
        return false;
    }
}