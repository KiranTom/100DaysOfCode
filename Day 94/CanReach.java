class Solution {
    public boolean canReach(int[] arr, int start) {
        
        Queue<Integer> q = new LinkedList();
        HashSet<Integer> jumped = new HashSet();
        q.add(start);
        
        while(!q.isEmpty()) {
            
            int i = q.poll();
            if(arr[i]==0){
                return true;
            }
            if(i+arr[i]>=0 && i+arr[i]<arr.length && !jumped.contains(i+arr[i])){
                jumped.add(i+arr[i]);
                q.add(i+arr[i]);
            }
            if(i-arr[i]>=0 && i-arr[i]<arr.length && !jumped.contains(i-arr[i])){
                jumped.add(i-arr[i]);
                q.add(i-arr[i]);
            }
        }
        return false;
    }
}