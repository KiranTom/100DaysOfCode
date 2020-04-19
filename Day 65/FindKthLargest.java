class Solution {
    public int findKthLargest(int[] nums, int k) {
  
    PriorityQueue<Integer> pq = new PriorityQueue<>();
        
	for (int n : nums) {
        
        pq.add(pq.size()==k ? Math.max(pq.poll(),n) : n);
    }
	return pq.poll(); 
    }
}