class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Set<Integer> opened = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        opened.add(0);
        
        while (!q.isEmpty()) {
            
            int node = q.poll();
            
            for (int n : rooms.get(node)) {
                
                if (!opened.contains(n)) {
                    q.add(n);
                    opened.add(n);
                }
            }
        }
        if(opened.size() == rooms.size()) {
            return true;   
        }
        else {
            return false;
        }
    }
}