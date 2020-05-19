class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        
        Queue<Integer> q = new LinkedList();
        Set<Integer> number = new HashSet();
        q.add(0);
        number.add(0);
        
        while (!q.isEmpty()) {
            
            for (int i = q.size(); i > 0; i--) {
                
                int node = q.poll();
                int left = leftChild[node];
                int right = rightChild[node];
                
                if (left != -1) {
                    if (number.contains(left)) 
                        return false;
                    q.add(left);
                    number.add(left);
                }
                if (right != -1) {
                    if (number.contains(right)) 
                        return false;
                    q.add(right);
                    number.add(right);
                }
            }
        }
        if (number.size() == n) {
            return true;
        }
        else {
            return false;
        }
    }
}