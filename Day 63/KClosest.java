class Solution {
    public int[][] kClosest(int[][] points, int K) {
        
        PriorityQueue <int[]> pq = new PriorityQueue<>
            ((x, y) -> (x[1]*x[1] + x[0]*x[0]) - (y[1]*y[1] + y[0]*y[0])) ;
        // the above formula is ulta of the normal distance formula just to pop the closer to 0 value
        
        for(int[] p: points) {
            
            pq.add(p);
        }
        
        ArrayList <int[]> list = new ArrayList<>(); // Can do same with array also
        while( K > 0 ) {
            
            list.add(pq.poll());
            K--;
        }
        
        int[][] res = new int[K][2];    // K or List.size()...both same
        return list.toArray(res);
    }
}   