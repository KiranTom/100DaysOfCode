class Solution {
    public int lastStoneWeight(int[] stones) {
     
        if (stones.length == 0) {
            return 0;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < stones.length; i++) {
            
            pq.offer(stones[i]);
        }
        while (pq.size() > 1) {
            
            int first = pq.poll();
            int second = pq.poll();
            pq.offer(first - second);
        }
        return pq.poll();
    }
}