class KthLargest {

    private Queue<Integer> pq = new PriorityQueue<Integer>();
    private int topK;
    
    public KthLargest(int k, int[] nums) {
        
        topK= k;
        for (int i = 0;i < nums.length;i++) {
            
            if (pq.size() == k) {
                if (pq.peek() < nums[i]) {
                    pq.poll();
                    pq.add(nums[i]);
                }
            } else {
                pq.add(nums[i]);
            }
            
        }
    }
    
    public int add(int val) {
        
        if (pq.size() < topK) {
            pq.add(val);
            return pq.peek();
        }
        int top = pq.peek();
        if (val > top) {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}