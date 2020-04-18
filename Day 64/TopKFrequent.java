class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        
        ArrayList<Integer> top = new ArrayList<Integer>();
        if(nums.length == 0 || nums == null) {
            return top;
        }
        
        HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>
            ((x,y)->hash.get(y) - hash.get(x));
        
        for(int n : nums) {
            
            hash.put(n,( hash.getOrDefault(n, 0) ) + 1);    //Just getting the occurances
        }
        
        pq.addAll(hash.keySet());
        
        while(k>0){ 
            
            top.add(pq.poll());
            k--;
        }
        return top;  
    }
}